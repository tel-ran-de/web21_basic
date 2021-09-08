package homewroksolution;

public class App {
    public static void main(String[] args) {

        Item i1 = new Item("Картофель", "К445", 200, "кг. ");
        Item i2 = new Item("Морковь  ", "М187", 150, "кг. ");
        Item i3 = new Item("Яблоки   ", "Я4889", 250, "кг. ");
        Item i4 = new Item("Сыр      ", "С635", 380, "кг. ");
        Item i5 = new Item("Молоко   ", "МЛ45", 110, "л.  ");
        Item i6 = new Item("Сахар    ", "С411", 80, "кг. ");
        Item i7 = new Item("Масло    ", "МС11", 250, "шт. ");
        Item i8 = new Item("Яйцо     ", "С411", 185, "дес.");
// завезли продукты на склад
        Warehouse lidl = new Warehouse("Лидл");
        lidl.addItem(i1, 100);
        lidl.addItem(i2, 70);
        lidl.addItem(i3, 60);
        lidl.addItem(i4, 50);
        lidl.addItem(i5, 100);
        lidl.addItem(i6, 200);
        lidl.addItem(i7, 100);
        lidl.addItem(i8, 50);
        System.out.println("----------  Товары на складе  -----------");
        System.out.println(lidl);

        // взяли корзину
        Cart lidlCart= new Cart(lidl);
        // набираем товары в корзину
        lidlCart.addItemToCard(i1,5);
        lidlCart.addItemToCard(i2,1);
        lidlCart.addItemToCard(i3,1);
        lidlCart.addItemToCard(i4,1);
        lidlCart.addItemToCard(i5,2);
        lidlCart.addItemToCard(i6,3);
        lidlCart.addItemToCard(i7,2);
        lidlCart.addItemToCard(i8,1);
        System.out.println("----------  Товары в корзине  -----------");

        System.out.println(lidlCart);
        lidlCart.printСheck();
    }
}
