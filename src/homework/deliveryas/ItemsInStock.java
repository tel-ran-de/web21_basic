package homework.deliveryas;

// Our Product and its quantity in Stock
class ItemInStock {
    private Item item;
    private int quantity;

    // create constructor for all variables
    // create only getter for item and quantity variables

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
        return "ItemInStock{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
