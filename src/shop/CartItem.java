package shop;

public class CartItem {
    private Item item;
    private int quantity;

    public CartItem() {
    }

    public CartItem(Item item, int quantity) {
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

    public int getItemPrice() {
        return item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "item=" + item +
                ", quantity=" + quantity;
    }
}
