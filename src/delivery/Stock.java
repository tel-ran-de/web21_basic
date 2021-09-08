package delivery;

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

    public void addDelivery(Delivery delivery) {
        deliveries.addFirst(delivery);
    }

    private int findIndex(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity) {
        if ( findIndex(item) == -1 ) {
            items.add( new ItemInStock(item, quantity));
            return;
        }
        ItemInStock itemInStock = items.get(findIndex(item));
        itemInStock.setQuantity( itemInStock.getQuantity() + quantity );
    }

    public boolean isInStock(Item item) {
        return findIndex(item) != -1;
    }

    public boolean isQuantityInStock(Item item, int needsQuantity) {
//        int index = findIndex(item);
//        ItemInStock _item = items.get(index);
//        boolean isTrue = _item.getQuantity() >= needsQuantity;
//        return isTrue;
        return items.get( findIndex(item) ).getQuantity() >= needsQuantity;
    }

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
