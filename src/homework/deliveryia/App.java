package homework.deliveryia;

// Доставка.
// Товар (код, название, единица изм., цена, вес)
// Товар на складе (товар, кол-во)
// Склад (Название, Товары на складе)
// Магазин (Название, Товары в магазине)
// Товар в магазине(Товар, кол-во, цена в магазине)
// Тип доставки (Название, Вместимость, стоимость доставки)
// Товар в машине (товар, кол-во)
// Доставка (Магазин, тип-доставки, Товар-в-машине)
// 1. Добавление товара
// 2. Добавление остатков на склад
// 3. Создание сети магазинов
// 4. Создание типа доставки
// 5. Доставка товара в магазин
// 6. Разгрузка товара в магазине
// 7. Расчет стоимости товара в магазине ((цена + цена доставки (за кол-во товара)) * 1.25)



public class App {
    public static void main(String[] args) {

        // Создаем наши товары
        Item i1 = new Item("b01", "Картофель", "кг", 300, 1000);
        Item i2 = new Item("b02", "Арбуз    ", "кг", 200, 1000);
        Item i3 = new Item("b03", "Свекла   ", "кг", 400, 1000);
        Item i4 = new Item("b04", "Яйцо    ", "шт", 10, 10);
        Item i5 = new Item("b05", "Огурец   ", "кг", 400, 1000);
        Item i6 = new Item("b06", "Помидор  ", "кг", 500, 1000);
        Item i7 = new Item("b07", "Капуста  ", "кг", 300, 1000);
        Item i8 = new Item("b08", "Чеснок   ", "кг", 250, 1000);
        Item i9 = new Item("b09", "Лук      ", "кг", 200, 1000);

        // Создаем наш центральный склад
        Stock stock = new Stock("У Михалыча");

        // Наполняем склад товарами в определенном кол-ве
        stock.addItem(i1, 10000);
        stock.addItem(i2, 2000);
        stock.addItem(i3, 1000);
        stock.addItem(i4, 5000);
        stock.addItem(i5, 10000);
        stock.addItem(i6, 10000);
        stock.addItem(i7, 10000);
        stock.addItem(i8, 5000);
        stock.addItem(i9, 5000);

        // Создаем тип доставки
        DeliveryType carType = new DeliveryType("Car", 1000000, 10000);
        // Типы доставки могут быть и разными
//        DeliveryType shipType = new DeliveryType("Ship", 100000000, 1000000);


        // Наполняем "гараж" нашего склада новыми созданными машинами
        for (int i = 0; i < 10; i++) {
            stock.addDelivery( new Delivery(carType) );
//            stock.addDelivery( new Delivery(shipType) );
        }
        System.out.println("1.==== товар на складе =====");
        // Первый вывод инициализированного и наполненного склада на консоль
        System.out.println("1. " + stock );
        System.out.println();

        // Создаем магазин
        Shop shop = new Shop("Солнышко");

        // Выбираем первую по очереди машину из гаража и готовим ее к отправке в определенный магазин
        Delivery car = stock.startInput(shop);
        // Машина загружает в себя необходимый товар в нужном кол-ве
        car.addItem(i1, 500);
        car.addItem(i2, 100);
        car.addItem(i3, 100);
        car.addItem(i4, 1000);
        car.addItem(i5, 200);
        car.addItem(i6, 200);
        car.addItem(i7, 200);
        car.addItem(i8, 200);
        // Удаляются со склада эти кол-ва
        stock.removeQuantityFromStock(i1, 500);
        stock.removeQuantityFromStock(i2, 100);
        stock.removeQuantityFromStock(i3, 100);
        stock.removeQuantityFromStock(i4, 1000);
        stock.removeQuantityFromStock(i5, 200);
        stock.removeQuantityFromStock(i6, 200);
        stock.removeQuantityFromStock(i7, 200);
        stock.removeQuantityFromStock(i8, 200);

        // Выводим на консоль состояние склада после загрузки первой машины
        System.out.println("2.==== товар на складе после отгрузки ====");
        System.out.println("2. " + stock );
        System.out.println();
        // Выводим на консоль состояние нашей загруженной машины
        System.out.println("3.==== товар в машине ====");
        System.out.println("3. " + car);
        System.out.println();
        // Просто красиво сообщаем через консоль о начале движения машины в магазин
        car.startMove();
        // Просто красиво сообщаем через консоль об окончании движения машины в магазин
        car.finishMove();
        // У машины смотрим куда (в какой магазин) она приехала и в этом магазине ставим нашу машину в очередь разгрузки
        car.getShop().addDelivery(car);

        // В магазине начинаем разгружать первую на очереди машину. Внутри товары добавляются в магазин, удаляются из машины,
        // машина удаляется из очереди на разгрузку
        shop.startOutput();
        // После окончания разгрузки машина встает в очередь на загрузку в гараж склада
        stock.addDelivery(car);

        // Выводим на консоль состояние магазина после разгрузки машины
        System.out.println("4.==== товар в магазине после разгрузки машины, машина в гараже ====");
        System.out.println("4. " + shop);
        System.out.println();
        // Выводим на консоль состояние склада после прихода товара из машины
        System.out.println("5.==== товар на складе ====");
        System.out.println("5. " + stock);
        System.out.println();

        // берем тележку
        Cart ShopCart=new Cart(shop);
        // набираем в  тележку товар из магазина
        ShopCart.addItemToCart(i1,1);
        ShopCart.addItemToCart(i2,3);
        ShopCart.addItemToCart(i3,1);
        ShopCart.addItemToCart(i4,10);
        ShopCart.addItemToCart(i5,1);
        ShopCart.addItemToCart(i6,1);
        System.out.println();
        System.out.println("6.==== товары в корзине ====");
        System.out.println("6. " + ShopCart);
        System.out.println();
        System.out.println("7.==== товары в магазине после продажи ====");
        System.out.println("7. "+ shop);
        System.out.println();
        ShopCart.printСheck();

    }
}