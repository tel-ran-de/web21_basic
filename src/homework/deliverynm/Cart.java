import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Cart {
    // корзина товаров
    private ArrayList<CartItem> items = new ArrayList<>();
    private Shop shop; // в каком магазине закупаем товары
    private LocalDateTime dataTime; // время печати чека

    public Cart(Shop shop) {
        this.shop = shop;
    }

    public void setDataTime() {
        this.dataTime = LocalDateTime.now();
    }

    public void printDataTime() {
        // печать времени и даты совершения покупки
        setDataTime();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss");
        System.out.println(dataTime.format(pattern));
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
        if (!shop.isInShop(item)) { // проверяет наличие товара в магазине
            return;
        }
        if (!shop.isQuantityInShop(item, quantity)) {// проверяет количество товара в магазине
            return;
        }
        int index = findIndex(item, items);
        if (index == -1) { // если товара в корзине нет, просто добавляем его с ценой из магазина
            items.add(new CartItem(item, quantity, shop.getPriceInShop(item)));
            // и удаляем из магазина
            shop.removeQuantityFromShop(item, quantity);
            return;
        }
        // если товар уже есть, увеличиваем его количество
        CartItem cartItem = items.get(index);
        cartItem.setQuantity(cartItem.getQuantity() + quantity);
        // и удаляем из магазина
        shop.removeQuantityFromShop(item, quantity);
    }

    public void removeQuantityFromCart(Item item, int needQuantity) {
        // удаление товара из корзины
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
        return "shop=" + shop.getName() +
                " items=" + items;
    }

    public void printСheck() {
        System.out.println("\n==========  Магазин " + shop.getName() + " ==========");
        System.out.println("**********     Чек за покупку    **********");
        printDataTime();
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            CartItem c = items.get(i);
            int p = c.getItemPrice(); // стоимость товара в корзине
            double pp = p * 1.0 / 100; // стоимость товара в евро
            sum += p;// итого
            double p1 = c.getPrice() * 1.0 / 100; // цена товара в евро
            String sP1 = String.format(Locale.US, "%.2f", p1);
            String sPp = String.format(Locale.US, "%.2f", pp);
            String sQ = String.format("%4d", c.getQuantity());
            Item item = c.getItem();
            System.out.println("- " + item.getName() + " " + sQ + " " + item.getUnit() +
                    "* " + sP1 + " ............. " + sPp + " E");
        }
        String sSum = String.format(Locale.US, "%.2f", sum * 1.0 / 100);
        System.out.println("*******   ИТОГО:    \t\t\t\t\t" + sSum + " Е");
    }
}
