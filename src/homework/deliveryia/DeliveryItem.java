package homework.deliveryia;

public class DeliveryItem {
    private Item item;
    private int quantity;

    public DeliveryItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DeliveryItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}