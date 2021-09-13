package homework.deliveryia;

import java.util.ArrayList;
import java.util.LinkedList;

public class Shop {
    private String name;
    public ArrayList<ItemInShop> shop = new ArrayList<>();
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
        deliveries.addFirst(delivery); //машина - в очередь на разгрузку
    }

    public void startOutput(){
        System.out.println("Разгрузка началась");
        Delivery delivery = deliveries.getLast(); // машина из головы для  разгрузки
        deliveries.removeLast();  //  машина удаляется из списка-очереди
        for (int i = 0; i < delivery.getItems().size(); i++) {
            Item item = delivery.getItems().get(i).getItem();
            int quantity = delivery.getItems().get(i).getQuantity();
            addItem( item, quantity, getNewPrice(item, delivery)  );  //добавление в продукты в магазине с новой ценой и к-вом
        }
        delivery.clearItems(); // товары разгружены
        System.out.println(delivery);
        System.out.println("Разгрузка закончена");
        System.out.println();
    }

    private int getNewPrice(Item item, Delivery delivery){  // рассчет розничной цены
        return (int) ((item.getWeight() * delivery.getDeliveryWeightCost() + item.getPrice()) * 1.25);
    }

    private int findIndex(Item item) {  // возрашает индекс продукта в списке, если нет в списке- возвращает  -1
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity, int price) {  // добавление тов в магазин
        if ( findIndex(item) == -1 ) {
            shop.add( new ItemInShop(item, quantity, price));
            return;
        }
        ItemInShop itemInShop = shop.get(findIndex(item));
        itemInShop.setQuantity( itemInShop.getQuantity() + quantity );// или увеличение кол-ва, если он там уже был
    }
    public boolean isInShop(Item item) {
        // есть ли товар на складе
//        return warehouse.contains(item);
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getItem() == item) {
                return true;    // true- если есть в маг-не, false - если нету
            }
        }
        return false;
    }

    public boolean isAmountInShop(Item item, int needQuantity) {
        // есть ли товар в нужном количестве
//       int index = warehouse.indexOf(item);
       int index = findIndex(item);
        return shop.get(index).getQuantity() >= needQuantity;
    }

    public void removeAmountInStock(Item item, int needQuantity) {
        // продажа товара со склада
//       int index = warehouse.indexOf(item);
        int index = findIndex(item);   // ищем по индексу товар и уменьщаем его к-во
        shop.get(index).setQuantity(shop.get(index).getQuantity() - needQuantity);
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name +"\n"+
                ",shop= " + shop +"\n"+
                ", deliveries=" + deliveries +
                '}';
    }
}