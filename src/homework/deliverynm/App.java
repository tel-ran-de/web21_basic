public class App {
    public static void main(String[] args) {
        Item i1 = new Item("b01", "Картофель", "кг", 300, 1);
        Item i2 = new Item("b02", "Арбуз    ", "кг", 200, 1);
        Item i3 = new Item("b03", "Свекла   ", "кг", 400, 1);
// создали склад
        Stock stock = new Stock("У Михалыча");
        // завезли на склад продукты
        stock.addItem(i1, 10000);
        stock.addItem(i2, 10000);
        stock.addItem(i3, 10000);
        System.out.println("\n================== Товары на складе "+stock.getName()+" =================");
        System.out.println(stock);
// создали тип грузовика
        DeliveryType carType = new DeliveryType("Car", 1000, 10000);
// поставили 10 таких грузовиков в гараж склада
        for (int i = 0; i < 10; i++) {
            stock.addDelivery(new Delivery(carType));
        }
// создали магазин
        Shop shop = new Shop("Солнышко");
// первая машина из гаража склада назначена на доставку в магазин
        Delivery car = stock.startInput(shop);
        // загружаем картошку в машину
        car.addItem(i1, 500);
        // убираем товар со склада
        stock.removeQuantityFromStock(i1, 500);
        // то же самое для арбузов
        car.addItem(i2, 100);
        stock.removeQuantityFromStock(i2, 100);
        // и для свеклы
        car.addItem(i3, 50);
        stock.removeQuantityFromStock(i3, 50);
        System.out.println("\n================== Товары едут в магазин "+car.getShop().getName()+" =================");
        System.out.println(car);
        System.out.println("\n================== Остатки товаров на складе "+stock.getName()+" =================");
        System.out.println(stock);
        System.out.println("\n================== Товары в магазине "+shop.getName()+" до доставки =================");
        System.out.println(shop);
        System.out.println("\n======================  Процесс доставки  =====================");
        // машина поехала
        car.startMove();
        // машина приехала
        car.finishMove();
        // машина просит магазин поставить ее в очередь на разгрузку
        car.getShop().addDelivery(car);
        // магазин разгружает машину
        shop.startOutput();
        // машина возвращается на склад
        stock.addDelivery(car);
        System.out.println("\n================ Товары в магазине "+shop.getName()+" после доставки ===============");
        System.out.println(shop); // товары в магазине

        Cart cart = new Cart(shop); // создаем корзину
        cart.addItemToCard(i1,7); // кладем в нее товар
        cart.addItemToCard(i2,12);
        cart.addItemToCard(i3,3);
        System.out.println("\n======================  Товары в корзине ======================");
        System.out.println(cart);
        // печатаем чек
        cart.printСheck();

    }
}
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