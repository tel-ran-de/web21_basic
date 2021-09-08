package homewroksolution;

public class CartItem {
    // продукт в корзине
    private Item item;
    private int quantity;

    public CartItem() {
    }

    public CartItem(Item item, int quantity) {
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

    public int getItemPrice() {
        // возвращает стоимость товара в корзине
        return item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return
                "\nitem=" + item +
                        ", quantity=" + quantity + "}";
    }
}
