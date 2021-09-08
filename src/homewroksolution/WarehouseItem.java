package homewroksolution;

public class WarehouseItem {
    // продукт на складе
    private Item item;
    private int quantity;

    public WarehouseItem() {
    }

    public WarehouseItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }


    public Item getItem() {
        return item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "\nitem=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
