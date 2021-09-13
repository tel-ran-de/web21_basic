package homework.deliveryia;

public class ItemInShop {
    private Item item;
    private int quantity;
    private int price;  // новая цена = розничная

    public ItemInShop(Item item, int quantity, int price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
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



    @Override
    public String toString() {
        return "ItemInShop{" +
                "item=" + item +
                ", quantity=" + quantity +
                ", newPrice=" + price +
                '}';
    }
}