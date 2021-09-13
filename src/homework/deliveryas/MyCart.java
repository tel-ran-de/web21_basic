package homework.deliveryas;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MyCart {
    private ArrayList<MyCartItem> items = new ArrayList<>();
    private Stock stock;

    public MyCart(Stock stock) {
        this.stock = stock;
    }

    public MyCart() {

    }

    // findIndex
    private int findIndex(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }

    //ABSTRACTED CODE that adds item to card and updates stock automatically

    public void addItemToCard(Item item, int quantity) {
        if(stock.isInStock(item) && stock.isQuantityInStock(item, quantity)) {
            stock.removeQuantityFromStock(item, quantity);
            items.add(new MyCartItem(item, quantity));
            System.out.println("added " + item.getName() + " with quantity: " + quantity);

        }
    }

    @Override
    public String toString() {
        return "stock=" + stock.getName() + "\nitems=" + items;
    }

    public void printCheck() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++){
            MyCartItem cartItem = items.get(i);
            Item item = cartItem.getItem();
            int quantity = cartItem.getQuantity();
            int itemSum = quantity*item.getPrice();
            sum += itemSum;
            System.out.println("item: " + item.getName() + " quantity: " + quantity + " price: " + itemSum);
        }
        System.out.println("total cost: " + sum);

        // DATE TIME FORMAT https://www.javatpoint.com/java-get-current-date

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("local time: " + dtf.format(now));
        System.out.println();
        System.out.println("YOUR NEXT PURCHASE IS WITH 10% DISCOUNT!");
    }

       }



