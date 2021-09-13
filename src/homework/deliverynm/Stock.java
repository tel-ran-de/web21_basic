import java.util.ArrayList;
import java.util.LinkedList;

public class Stock {
    // склад
    private String name;
    private ArrayList<ItemInStock> items = new ArrayList<>(); // товары на складе
    private LinkedList<Delivery> deliveries = new LinkedList<>(); // машины в гараже склада

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
        // склад добавляет машину в гараж
        deliveries.addFirst(delivery);
    }

    private int findIndex(Item item) {
        // аналог indexOf()
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity) {
        // склад пополняет свои товары
        if (findIndex(item) == -1) { // если такого товара еще нет, добавляет его
            items.add(new ItemInStock(item, quantity));
            return;
        } // если такой товар уже есть
        ItemInStock itemInStock = items.get(findIndex(item)); // находит его индекс
        itemInStock.setQuantity(itemInStock.getQuantity() + quantity); // и увеличивает его количество
    }

    public boolean isInStock(Item item) {
        // аналог contains()
        return findIndex(item) != -1;
    }

    public boolean isQuantityInStock(Item item, int needsQuantity) {
        // товар на складе в достаточном для отгрузки количестве?
//        int index = findIndex(item);
//        ItemInStock _item = items.get(index);
//        boolean isTrue = _item.getQuantity() >= needsQuantity;
//        return isTrue;
        return items.get(findIndex(item)).getQuantity() >= needsQuantity;
    }

    public void removeQuantityFromStock(Item item, int quantity) {
        // склад уменьшает количество товара
        int index = findIndex(item);
        ItemInStock itemInStock = items.get(index);
        itemInStock.setQuantity(itemInStock.getQuantity() - quantity);
    }

    public Delivery startInput(Shop shop) {
        // начало загрузки на складе
        // склад берет машину из гаража
        Delivery car = deliveries.getLast();
        // указывает машине магазин доставки
        car.setShop(shop);
        // удаляет машину из своего гаража
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
