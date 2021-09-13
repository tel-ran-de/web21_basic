package homework.deliveryia;

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

    private int findIndex(Item item) {   // возрашает индекс продукта в списке, если нет в списке- возвращает  -1
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItem(Item item, int quantity) {  //добавление товара в список доставки
        if ( findIndex(item) == -1 ) {
            items.add( new DeliveryItem(item, quantity));
            return;
        }
        DeliveryItem itemInDelivery = items.get(findIndex(item));
        itemInDelivery.setQuantity( itemInDelivery.getQuantity() + quantity );// или увеличение кол-ва, если он там уже был

    }

    public void removeItem(Item item) {  // удаление товара из списка товаров для доставки- * мы не используем

        items.remove( findIndex(item) );
    }

    public ArrayList<DeliveryItem> getItems() { //geter для списка
        return items;
    }

    public void clearItems() {  //  очистка списка товара для доставки после доставки в магазин
        items.clear();
        shop = null;       //  и привязки доставки  к магазину
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