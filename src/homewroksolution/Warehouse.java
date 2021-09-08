package homewroksolution;

import java.util.ArrayList;

public class Warehouse {
    // склад продуктов
    public ArrayList<WarehouseItem> warehouse;// = new ArrayList<>(); можно и тут
    private String name; // название магазина

    public Warehouse() {
    }

    public Warehouse(String name) {
        warehouse = new ArrayList<WarehouseItem>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int findIndex(Item item, ArrayList<WarehouseItem> warr) {
        // возвращает индекс элемента, содержащего объект item
        for (int i = 0; i < warr.size(); i++) {
            if (warr.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity) {
        // добавляет продукт item на склад в количестве quantity
//        int index = warehouse.indexOf(item);
        int index = findIndex(item, warehouse);
        if (index == -1) { // продукта нет - добавляем продукт
            warehouse.add(new WarehouseItem(item, quantity));
            return;
        }
        // продукт есть - увеличиваем количество
        warehouse.get(index).setQuantity(warehouse.get(index).getQuantity() + quantity);
    }

    public boolean isInStock(Item item) {
        // есть ли товар на складе
//        return warehouse.contains(item);
        for (int i = 0; i < warehouse.size(); i++) {
            if (warehouse.get(i).getItem() == item) {
                return true;
            }
        }
        return false;
    }

    public boolean isAmountInStock(Item item, int needQuantity) {
        // есть ли товар в нужном количестве
//        int index = warehouse.indexOf(item);
        int index = findIndex(item, warehouse);
        return warehouse.get(index).getQuantity() >= needQuantity;
    }

    public void removeAmountInStock(Item item, int needQuantity) {
        // продажа товара со склада
//        int index = warehouse.indexOf(item);
        int index = findIndex(item, warehouse);
        warehouse.get(index).setQuantity(warehouse.get(index).getQuantity() - needQuantity);
    }

    @Override
    public String toString() {
        return "name='" + name + "\'\n" +
                "warehouse=" + warehouse + "\n";
    }
}
