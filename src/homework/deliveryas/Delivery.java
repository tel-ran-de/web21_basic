package homework.deliveryas;

import java.util.ArrayList;

//(Магазин, тип-доставки, Товар-в-машине)
public class Delivery {

    //create class shop with variables type and array of items

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
    // adding items to stock, adding items to shop, adding items to car, removing items

    public void addItem(Item item, int quantity) {
        if ( findIndex(item) == -1 ) {
            items.add( new DeliveryItem(item, quantity));
            return;
        }
        DeliveryItem itemInDelivery = items.get(findIndex(item));
        itemInDelivery.setQuantity( itemInDelivery.getQuantity() + quantity );

    }

    // Razgruzka: we delivered items to shop and do not have this items anymore

    public void removeItem(Item item) {
        items.remove( findIndex(item) );
    }

    public ArrayList<DeliveryItem> getItems() {
        return items;
    }

    // Process zagryzki

    public void clearItems() {
        items.clear();
        shop = null;
    }

    public void startMove() {
        System.out.println("Доставка началась");
    }

    public void finishMove() {
        System.out.println("Доставка в магазин состоялась");

    }

    public double getDeliveryWeightCost() {
        return (double) type.getCost() / type.getMaxWeight();
    }


    @Override
    public String toString() {
        String shopName = this.shop != null ? " Едем в " + this.shop.getName() + ", " : "";
        return "Delivery{" +
                shopName  +
                "type=" + type +
                ", items=" + items +
                '}';
    }
}
