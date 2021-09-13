package homework.deliveryas;

// Constructor, getter and setter and toString for ALL variables
public class DeliveryItem {
    private Item item;
    private int quantity;

    //class for delivery item  - product itself and amount

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
