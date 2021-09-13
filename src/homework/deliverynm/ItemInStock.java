public class ItemInStock {
    // товары на складе
    private Item item; // товар
    private int quantity;  // количество

    public ItemInStock(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "\nItemInStock{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
