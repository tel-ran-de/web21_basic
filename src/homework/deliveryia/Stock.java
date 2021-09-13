package homework.deliveryia;

import java.util.ArrayList;
import java.util.LinkedList;

public class Stock {
    private String name;
    private ArrayList<ItemInStock> items = new ArrayList<>();
    private LinkedList<Delivery> deliveries = new LinkedList<>();

    public Stock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDelivery(Delivery delivery) {// машина встала в очередь на загрузку
        deliveries.addFirst(delivery);
    }

    private int findIndex(Item item) {           // возрашает индекс продукта в списке,
                                                    //если нет в списке- возвращает  -1
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity) {   //добавление товара в список склада
        if ( findIndex(item) == -1 ) {
            items.add( new ItemInStock(item, quantity));
            return;
        }
        ItemInStock itemInStock = items.get(findIndex(item));
        itemInStock.setQuantity( itemInStock.getQuantity() + quantity ); // или увеличение кол-ва, если он там уже был
    }

    public boolean isInStock(Item item) {
        return findIndex(item) != -1;      // true- если есть на складе, false - если нету
    }

    public boolean isQuantityInStock(Item item, int needsQuantity) {
//        int index = findIndex(item);
//        ItemInStock _item = items.get(index);
//        boolean isTrue = _item.getQuantity() >= needsQuantity;
//        return isTrue;
        return items.get( findIndex(item) ).getQuantity() >= needsQuantity;  // true- если достаточное к-во на складе,
                                                                                // false - если недостаточно
    }

    public void removeQuantityFromStock(Item item, int quantity) {   // списание со склада
        int index = findIndex(item);
        ItemInStock itemInStock = items.get(index);
        itemInStock.setQuantity(itemInStock.getQuantity() - quantity); // минусуя кол-во
    }

    public Delivery startInput(Shop shop) {
        Delivery car = deliveries.getLast(); // получаем машину для загрузки
        car.setShop(shop);       // указываем в какой магазин поедет
        deliveries.removeLast();  // машину удаляем из очереди
        return car;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", items=" + items +
                ", deliveries=" + deliveries +
                '}';
    }
}