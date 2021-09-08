package homewroksolution;

public class Item {
    // продукт
    private String name;
    private String barCode;
    private int price;
    private String unit; // единица измерения

    public Item() {
    }

    public Item(String name, String barCode, int price, String unit) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
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
                ", barCode='" + barCode + '\'' +
                ", price=" + price;
    }
}
