package homework.deliveryas;

// Доставка.
// Товар (код, название, единица изм., цена, вес) ========== Item
// Товар на складе (товар, кол-во) ========== ItemsIn Stock in ArrayList (asortiment: items and amount)
// Склад (Название, Товары на складе) ===========
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

// we created object Stock, we refer to him via method addItem

public class App {
    public static void main(String[] args) {

        // Создаем наши товары/ Item
        Item i1 = new Item("b01", "Картофель", "кг", 300, 1000);
        Item i2 = new Item("b02", "Арбуз", "кг", 200, 1000);
        Item i3 = new Item("b03", "Свекла", "кг", 400, 1000);
        Item i4 = new Item("b04", "Яйцо", "шт", 10, 10);

        // Создаем наш центральный склад
        Stock stock = new Stock("У Михалыча"); // Created object Stock, we refer to whim via method addItem

        // Наполняем склад товарами в определенном кол-ве
        stock.addItem(i1, 10000);
        stock.addItem(i2, 10000);
        stock.addItem(i3, 10000);
        stock.addItem(i4, 10000);


        // Создаем тип доставки
        DeliveryType carType = new DeliveryType("Car", 1000000, 10000);
        // Типы доставки могут быть и разными
//        DeliveryType shipType = new DeliveryType("Ship", 100000000, 1000000);


        // Наполняем "гараж" нашего склада новыми созданными машинами
        for (int i = 0; i < 10; i++) {
            stock.addDelivery(new Delivery(carType));
//            stock.addDelivery( new Delivery(shipType) );
        }

        // Первый вывод инициализированного и наполненного склада на консоль
        System.out.println("1. " + stock);

        // Создаем магазин

        Shop shop = new Shop("Солнышко");

        // Выбираем первую по очереди машину из гаража и готовим ее к отправке в определенный магазин
        Delivery car = stock.startInput(shop);
        // Машина загружает в себя необходимый товар в нужном кол-ве
        car.addItem(i1, 500);
        // Склад удаляет из своих запасов загруженное в машину кол-во товара
        stock.removeQuantityFromStock(i1, 500);
        car.addItem(i2, 100);
        stock.removeQuantityFromStock(i2, 100);
        car.addItem(i4, 1000);
        stock.removeQuantityFromStock(i4, 1000);

        // Выводим на консоль состояние склада после загрузки первой машины
        System.out.println("2. " + stock);
        // Выводим на консоль состояние нашей загруженной машины
        System.out.println("3. " + car);
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
        System.out.println("4. " + shop);
        // Выводим на консоль состояние склада после прихода машины
        System.out.println("5. " + stock);

        // Ждем дальнейших инструкций!!!

        System.out.println("=========HOMEWORK==========");
        System.out.println();
        System.out.println("--------We put our Items to Cart--------");


        /* 1.ADD ITEMS TO CART
        2. remove items from Stock, check if they are available and update the stock
        3. Print check with all items, quantity, total and local time
        */

        //Create object Cart

        MyCart cart = new MyCart(stock);

        /*
        if(stock.isInStock(i4) && stock.isQuantityInStock(i4, 10)) {
            System.out.println("i4 in stock");
            cart.addItemToCard(i4,10);
            stock.removeQuantityFromStock(i4, 10);
        }
        if(stock.isInStock(i2) && stock.isQuantityInStock(i2, 50)) {
            System.out.println("i2 in stock");
            cart.addItemToCard(i2,50);
            stock.removeQuantityFromStock(i2, 50);
        }
        */
        cart.addItemToCard(i4, 10);
        cart.addItemToCard(i2, 50);
        System.out.println("----------  Товары в корзине  -----------");

        // CALL FUNCTION PRINT CHECK

        System.out.println(cart);
        cart.printCheck();
    }

}
