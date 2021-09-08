package delivery;

public class ItemInShop {
    private Item item;
    private int quantity;
    private int price;

    public ItemInShop(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.price = getNewPrice();
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int getNewPrice() {


        return this.price;
    }

    @Override
    public String toString() {
        return "ItemInShop{" +
                "item=" + item +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
