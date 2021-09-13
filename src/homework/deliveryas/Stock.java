package homework.deliveryas;

import java.util.ArrayList;
import java.util.LinkedList;

// the name of our Items + constructor only for name, getter and setter only for variable name

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

    public void addDelivery(Delivery delivery) {
        deliveries.addFirst(delivery);
    }

    // method that finds our Item -  возвращает индекс элемента, содержащего объект item

    private int findIndex(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    // method that accepts item and its quantity
    // if item not found we add NEW ITEM in stock
    //добавляет продукт item на склад в количестве quantity

    public void addItem(Item item, int quantity) { // we generate new object
        if ( findIndex(item) == -1 ) { // продукта нет - добавляем продукт
            items.add( new ItemInStock(item, quantity));
            return;
        }
        ItemInStock itemInStock = items.get(findIndex(item)); // продукт есть - увеличиваем количество
        itemInStock.setQuantity( itemInStock.getQuantity() + quantity );
    }

    // method that accepts our Item and returns index that we found that not equals -1

    public boolean isInStock(Item item) {
        return findIndex(item) != -1;
    }

    // method that checks if we have enough items in stock
    // Items is ArrayList
    // we compare get quantity with need quantity

    public boolean isQuantityInStock(Item item, int needsQuantity) { //есть ли товар на складе
//        int index = findIndex(item);
//        ItemInStock _item = items.get(index);
//        boolean isTrue = _item.getQuantity() >= needsQuantity;
//        return isTrue;
        return items.get( findIndex(item) ).getQuantity() >= needsQuantity;
    }

    // when we took n amount of items from stock, we need to deduct it from stock

    public void removeQuantityFromStock(Item item, int quantity) {
        int index = findIndex(item);
        ItemInStock itemInStock = items.get(index);
        itemInStock.setQuantity(itemInStock.getQuantity() - quantity);
    }

    public Delivery startInput(Shop shop) {
        Delivery car = deliveries.getLast();
        car.setShop(shop);
        deliveries.removeLast();
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
