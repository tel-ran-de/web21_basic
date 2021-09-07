package shop;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items = new ArrayList<>();
    private Warehouse warehouse;

    public Cart(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void addItemToCart(Item item, int quantity) {

        if (! warehouse.isInStock(item)) {
            return;
        }

        if (!warehouse.isAmountInStock(item, quantity)) {
            return;
        }

        int index = items.indexOf(item);
        if (index == -1) {
            items.add( new CartItem(item, quantity));
            return;
        }
        CartItem cartItem = items.get(index);
        cartItem.setQuantity( cartItem.getQuantity() + quantity );

        warehouse.removeAmountInStock(item, quantity);

    }

    public void removeAmountInStock(Item item, int needsQuantity) {
        int index = items.indexOf(item);
        CartItem cartItem = items.get(index);
        cartItem.setQuantity( cartItem.getQuantity() - needsQuantity );
        if ( cartItem.getQuantity() == 0 ) {
            items.remove(index);
        }
    }

    /*
    ToDo Написать метод, возвращающий чек к оплате за корзину
     */

}
