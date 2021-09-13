public class ItemInShop {
    // товары в магазине
    private Item item; // товар
    private int quantity; // количество
    private int price; // цена товара в магазине

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

    private int getNewPrice() {

        return this.price;
    }

    @Override
    public String toString() {
        return "\nItemInShop{" +
                "item=" + item +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
