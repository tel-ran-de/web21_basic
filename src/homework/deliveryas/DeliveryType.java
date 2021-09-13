package homework.deliveryas;

// (Название, Вместимость, стоимость доставки)
// add constructor, getter-setter and toString for all variables

public class DeliveryType {
    private String name;
    private int maxWeight;
    private int cost;

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

    public int getMaxWeight() {   // create method that returns maximum weight
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
