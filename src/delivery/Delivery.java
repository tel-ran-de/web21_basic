package delivery;

import java.util.ArrayList;

//(Магазин, тип-доставки, Товар-в-машине)
public class Delivery {

    private Shop shop;
    private DeliveryType type;
    private ArrayList<DeliveryItem> items = new ArrayList<>();

    public Delivery( DeliveryType type) {
        this.type = type;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public DeliveryType getType() {
        return type;
    }

    private int findIndex(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity) {
        if ( findIndex(item) == -1 ) {
            items.add( new DeliveryItem(item, quantity));
            return;
        }
        DeliveryItem itemInDelivery = items.get(findIndex(item));
        itemInDelivery.setQuantity( itemInDelivery.getQuantity() + quantity );

    }

    public void removeItem(Item item) {
        items.remove( findIndex(item) );
    }

    public ArrayList<DeliveryItem> getItems() {
        return items;
    }

    public void clearItems() {
        items.clear();
    }


    public void startMove() {
        System.out.println("Доставка началась");
    }

    public void finishMove() {
        System.out.println("Доставка в магазин состоялась");

    }


    @Override
    public String toString() {
        return "Delivery{" +
                "shop=" + shop +
                ", type=" + type +
                ", items=" + items +
                '}';
    }
}
