package delivery;
//(код, название, единица изм., цена, вес)
public class Item {
    private String barcode;
    private String name;
    private String unit;
    private int price;
    private int weight;

    public Item(String barcode, String name, String unit, int price, int weight) {
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.weight = weight;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
