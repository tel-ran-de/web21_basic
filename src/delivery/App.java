package delivery;

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
//


public class App {
    public static void main(String[] args) {
        Item i1 = new Item("b01", "Картофель", "кг", 300, 1);
        Item i2 = new Item("b02", "Арбуз", "кг", 200, 1);
        Item i3 = new Item("b03", "Свекла", "кг", 400, 1);

        Stock stock = new Stock("У Михалыча");
        stock.addItem(i1, 10000);
        stock.addItem(i2, 10000);
        stock.addItem(i3, 10000);

        DeliveryType carType = new DeliveryType("Car", 1000, 10000);


        for (int i = 0; i < 10; i++) {
            stock.addDelivery( new Delivery(carType) );
        }

        Shop shop = new Shop("Солнышко");

        Delivery car = stock.startInput(shop);
        car.addItem(i1, 500);
        stock.removeQuantityFromStock(i1, 500);
        car.addItem(i2, 100);
        stock.removeQuantityFromStock(i2, 100);

        System.out.println( stock );
        System.out.println(car);
        car.startMove();
        car.finishMove();
        car.getShop().addDelivery(car);

        shop.startOutput();
        stock.addDelivery(car);

        System.out.println(shop);
        System.out.println(stock);


    }
}
