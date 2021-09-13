public class CartItem {
    // продукт в корзине
    private Item item;
    private int quantity;
    private int price; // цена товара (из магазина)

    public CartItem() {
    }

    public CartItem(Item item, int quantity, int price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItemPrice() {
        // возвращает стоимость товара в корзине
        return price * quantity;
    }

    @Override
    public String toString() {
        return  "\nitem=" + item +
                ", quantity=" + quantity +
                ", price=" + price;
    }
}
