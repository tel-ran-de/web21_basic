package homewroksolution;

import java.util.ArrayList;
import java.util.Locale;

public class Cart {
    // корзина товаров
    private ArrayList<CartItem> items = new ArrayList<>();
    private Warehouse warehouse; // с какого склада закупаем товары

    public Cart(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int findIndex(Item item, ArrayList<CartItem> carr) {
        // возвращает индекс элемента, содержащего объект item
        for (int i = 0; i < carr.size(); i++) {
            if (carr.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    public void addItemToCard(Item item, int quantity) {
        // помещает товар item в количестве quantity в корзину
        if (!warehouse.isInStock(item)) { // проверяет наличие товара на складе
            return;
        }
        if (!warehouse.isAmountInStock(item, quantity)) {// проверяет количество товара на складе
            return;
        }
//        int index = items.indexOf(item);
        int index = findIndex(item, items);
        if (index == -1) { // если товара в корзине нет, просто добавляем его
            items.add(new CartItem(item, quantity));
            // и списываем со склада
            warehouse.removeAmountInStock(item, quantity);
            return;
        }
        // если товар уже есть, увеличиваем его количество
        CartItem cartItem = items.get(index);
        cartItem.setQuantity(cartItem.getQuantity() + quantity);
        // и списываем со склада
        warehouse.removeAmountInStock(item, quantity);
    }

    public void removeAmountInStock(Item item, int needQuantity) {
        // удаление товара из корзины
//        int index = items.indexOf(item);
        int index = findIndex(item, items);
        CartItem cartItem = items.get(index);
        cartItem.setQuantity(cartItem.getQuantity() - needQuantity);
        // если количество стало=0, удаляем продукт
        if (cartItem.getQuantity() == 0) {
            items.remove(index);
        }
    }

    @Override
    public String toString() {
        return "warehouse=" + warehouse.getName() + "\nitems=" + items;
    }

    public void printСheck() {
        System.out.println("\n=============  Склад " + warehouse.getName() + " ============");
        System.out.println("*******     Чек за покупку    *******");
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            CartItem c = items.get(i);
            int p = c.getItemPrice(); // стоимость товара
            double pp = p * 1.0 / 100; // стоимость товара в евро
            sum += p;// итого
            Item item = c.getItem();
            double p1 = item.getPrice() * 1.0 / 100; // цена товара в евро
            String sP1 = String.format(Locale.US, "%.2f", p1);
            String sPp = String.format(Locale.US, "%.2f", pp);
            System.out.println("- " + item.getName() + " " + c.getQuantity() + " " + item.getUnit() +
                    "* " + sP1 + " ........... " + sPp + " E");
        }
        String sSum = String.format(Locale.US, "%.2f", sum * 1.0 / 100);
        System.out.println("******  ИТОГО:  \t\t\t\t\t" + sSum + " Е");
    }
}
