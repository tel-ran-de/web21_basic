package shop;

public class Item {
    private String name;
    private String barcode;
    private int price;

    public Item() {
    }

    public Item(String name, String barcode, int price) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                ", price=" + price;
    }
}
