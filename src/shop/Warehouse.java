package shop;

import java.util.ArrayList;

public class Warehouse {
    private ArrayList<WarehouseItem> warehouse = new ArrayList<>();
    private String name;

    public Warehouse(String name) {
        this.name = name;
    }

    public void addItem(Item item, int quantity) {
        int index = warehouse.indexOf(item);
        if (index == -1) {
            warehouse.add( new WarehouseItem(item, quantity));
            return;
        }
        WarehouseItem wI = warehouse.get(index);
        wI.setQuantity( wI.getQuantity() + quantity );
    }

    public boolean isInStock(Item item) {
        return warehouse.contains(item);
    }

    public boolean isAmountInStock(Item item, int needsQuantity) {
        int index = warehouse.indexOf(item);
        return warehouse.get(index).getQuantity() >= needsQuantity;
    }

    public void removeAmountInStock(Item item, int needsQuantity) {
        int index = warehouse.indexOf(item);
        WarehouseItem wI = warehouse.get(index);
        wI.setQuantity( wI.getQuantity() - needsQuantity );
    }
}
