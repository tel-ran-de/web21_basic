package delivery;

import java.util.ArrayList;
import java.util.LinkedList;

public class Shop {
    private String name;
    private ArrayList<ItemInShop> items = new ArrayList<>();
    private LinkedList<Delivery> deliveries = new LinkedList<>();

    public Shop() {
    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDelivery(Delivery delivery) {
        System.out.println("Доставка встала в очередь на разгрузку");
        deliveries.addFirst(delivery);
    }

    public void startOutput(){
        System.out.println("Разгрузка началась");
        Delivery delivery = deliveries.getLast();
        deliveries.removeLast();
        for (int i = 0; i < delivery.getItems().size(); i++) {
            Item item = delivery.getItems().get(i).getItem();
            int quantity = delivery.getItems().get(i).getQuantity();
            addItem( item, quantity, getNewPrice(item, delivery)  );
        }
        delivery.clearItems();
        // ToDo Не работает очистка ArrayList
        System.out.println(delivery);
        System.out.println("Разгрузка закончена");
    }

    private int getNewPrice(Item item, Delivery delivery){
        return (int) ((item.getWeight() * delivery.getDeliveryWeightCost() + item.getPrice()) * 1.25);
    }

    private int findIndex(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity, int price) {
        if ( findIndex(item) == -1 ) {
            items.add( new ItemInShop(item, quantity, price));
            return;
        }
        ItemInShop itemInShop = items.get(findIndex(item));
        itemInShop.setQuantity( itemInShop.getQuantity() + quantity );
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", items=" + items +
                ", deliveries=" + deliveries +
                '}';
    }
}
