package homework.deliveryas;

public class MyCartItem {
    private Item item;
    private int quantity;

// do I need to add cost???????

    public MyCartItem() {

    }

    public MyCartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "MyCartItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }

}
