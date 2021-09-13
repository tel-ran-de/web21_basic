public class DeliveryItem {
    // товары в пути
    private Item item; // товар
    private int quantity; // количество

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
        return "\nDeliveryItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
