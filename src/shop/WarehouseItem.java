package shop;

public class WarehouseItem {
    private Item item;
    private int quantity;

    public WarehouseItem() {
    }

    public WarehouseItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "WarehouseItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
