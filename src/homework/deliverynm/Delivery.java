import java.util.ArrayList;

public class Delivery {
    // доставка (машина с товарами и адресом доставки)
    private Shop shop; // магазин доставки
    private DeliveryType type; // характеристики транспорта
    private ArrayList<DeliveryItem> items = new ArrayList<>(); // товары в пути

    public Delivery(DeliveryType type) {
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
        // машина загружает товар
        if (findIndex(item) == -1) { // если его в ней еще нет, просто добавляет
            items.add(new DeliveryItem(item, quantity));
            return;
        } // если он уже есть, увеличивает количество
        DeliveryItem itemInDelivery = items.get(findIndex(item));
        itemInDelivery.setQuantity(itemInDelivery.getQuantity() + quantity);
    }

    public ArrayList<DeliveryItem> getItems() {
        // машина возвращает список товаров в ней
        return items;
    }

    public void removeItem(Item item) {
        // машина удаляет товар item
        items.remove(findIndex(item));
    }

    public void clearItems() {
        // машина удаляет весь товар
        items.clear();
    }

    public void startMove() {
        System.out.println("Доставка началась");
    }

    public void finishMove() {
        System.out.println("Доставка прибыла в магазин");
    }

    public double getDeliveryWeightCost(){
        // возвращает коэффициент доставки
        return (double) type.getCost()/type.getMaxWeight();
    }

    @Override
    public String toString() {
        return "Delivery{" +
                ", items=" + items +
                '}';
    }
}
