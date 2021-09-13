package homework.deliveryia;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Cart {
    // корзина товаров
    private ArrayList<CartItem> items = new ArrayList<>();
    private Shop cartShop; // с какого магазина закупаем товары

    public Cart(Shop warehouse) {
        this.cartShop = warehouse;
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

    public void addItemToCart(Item item, int quantity) {
        // помещает товар item в количестве quantity в корзину
        if (!cartShop.isInShop(item)) { // проверяет наличие товара в магазине
            return;
        }
        if (!cartShop.isAmountInShop(item, quantity)) {// проверяет количество товара в магазине
            return;
        }
//        int index = items.indexOf(item);
        int index = findIndex(item, items);
        if (index == -1) { // если товара в корзине нет, просто добавляем его
            items.add(new CartItem(item, quantity));
            // и списываем с магазна
            cartShop.removeAmountInStock(item, quantity);
            return;
        }
        // если товар уже есть, увеличиваем его количество
        CartItem cartItem = items.get(index);
        cartItem.setQuantity(cartItem.getQuantity() + quantity);
        // и списываем со склада
        cartShop.removeAmountInStock(item, quantity);
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
        return "cartShop=" + cartShop.getName() + "\nitems=" + items;
    }

    public void printСheck() {
        System.out.println("\n============ Магазин " + cartShop.getName() + " ============");
        LocalDateTime dt1=LocalDateTime.now();  // текущ. дата и время
        DateTimeFormatter patternDate=DateTimeFormatter.ofPattern("dd.MM.yyyy   HH:mm:ss");//задаем формат
        String formatDateTime=dt1.format(patternDate);
        System.out.println("\t\t\tДата:        Время:");
        System.out.println("\t\t\t" +formatDateTime);  // выводим в формате
        System.out.println();
        System.out.println("*********     Чек за покупку     *********");
        System.out.println();
        double sum = 0;
        for (int i = 0; i < items.size(); i++) {   //цикл по товарам в корзине
            CartItem c = items.get(i);
            int p=0;
            String barc1=c.getItemBarcode();    // код товара
            for (int j = 0; j < cartShop.shop.size(); j++) {
                ItemInShop cc = cartShop.shop.get(j);
                String barc2 = cc.getItem().getBarcode();// находим товар по коду, чтобы получить розн.цену
                if (barc1 == barc2) {
                    p=cc.getPrice();  //рознич.цена
                }
            }
            double pp = p * 1.0 / 100; // рознич.цена товара в евро
            sum = sum + pp*c.getQuantity();// итого
            Item item = c.getItem();
            double s = pp*c.getQuantity(); // стоимость товара в евро
            String sPs = String.format(Locale.US, "%.2f", s);
            String sPp = String.format(Locale.US, "%.2f", pp);
            System.out.println("- " + item.getName() + " " + c.getQuantity() + " " + item.getUnit() +
                    "* " + sPp + " ............ " + sPs + " E");
        }
        String sSum = String.format(Locale.US, "%.2f", sum);
        System.out.println("\t\t\t\t\t\t\t______________");
        System.out.println("\t\t\t\t\t\t\tИТОГО: " + sSum + " Е");
        System.out.println("\t\t\t\t\t\t\t______________");
        System.out.println("\t\t\tСпасибо за покупку!");
        System.out.println("==========================================");
    }
}