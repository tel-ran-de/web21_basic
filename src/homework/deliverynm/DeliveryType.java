public class DeliveryType {
    // транспорт
    private String name; // машина, самолет, фура
    private int maxWeight; // объем в кг
    private int cost; // стоимость

    public DeliveryType(String name, int maxWeight, int cost) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "DeliveryType{" +
                "name='" + name + '\'' +
                ", maxWeight=" + maxWeight +
                ", cost=" + cost +
                '}';
    }
}
