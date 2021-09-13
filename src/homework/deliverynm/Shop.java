import java.util.ArrayList;
import java.util.LinkedList;

public class Shop {
    // магазин
    private String name;
    private ArrayList<ItemInShop> items = new ArrayList<>(); // товары в магазине
    private LinkedList<Delivery> deliveries = new LinkedList<>(); // очередь машин на разгрузку

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInShop(Item item) {
        int i = findIndex(item);
        return items.get(i).getPrice();
    }

    public void addDelivery(Delivery delivery) {
        // магазин принимает машину в очередь
        System.out.println("Доставка встала в очередь на разгрузку");
        deliveries.addFirst(delivery);
    }

    public void startOutput() {
        // магазин разгружает машину
        System.out.println("Разгрузка началась");
        // запоминает машину
        Delivery delivery = deliveries.getLast();
        // удаляет машину из очереди на разгрузку
        deliveries.removeLast();
        // переносит товары из машины в себя
        for (int i = 0; i < delivery.getItems().size(); i++) {
            Item item = delivery.getItems().get(i).getItem();
            int quantity = delivery.getItems().get(i).getQuantity();
            addItem(item, quantity, getNewPrice(item, delivery));
        } // удаляет товары из машины
        delivery.clearItems();
        System.out.println("Разгрузка закончена");
    }

    public void addItem(Item item, int quantity, int price) {
        // магазин добавляет товар
        if (findIndex(item) == -1) {
            items.add(new ItemInShop(item, quantity, price));
            return;
        }
        ItemInShop itemInShop = items.get(findIndex(item));
        itemInShop.setQuantity(itemInShop.getQuantity() + quantity);
    }

    private int getNewPrice(Item item, Delivery delivery) {
        // возвращает цену товара в магазине (с учетом доставки)
        return (int) (item.getWeight() * delivery.getDeliveryWeightCost() + item.getPrice() * 1.25);
    }

    private int findIndex(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public boolean isInShop(Item item) {
        // аналог contains()
        return findIndex(item) != -1;
    }

    public boolean isQuantityInShop(Item item, int needsQuantity) {
        // товар в магазине в достаточном для покупке количестве?
        return items.get(findIndex(item)).getQuantity() >= needsQuantity;
    }

    public void removeQuantityFromShop(Item item, int quantity) {
        // магазин уменьшает количество товара
        int index = findIndex(item);
        ItemInShop itemInShop = items.get(index);
        itemInShop.setQuantity(itemInShop.getQuantity() - quantity);
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
