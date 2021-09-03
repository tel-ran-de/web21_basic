package train;

public class WagonType {
    public String name;
    public int seats;
    public double seatCost;

    public WagonType(String name, int seats, double seatCost) {
        this.name = name;
        this.seats = seats;
        this.seatCost = seatCost;
    }

    public String toString() {
        return "WagonType{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                ", seatCost=" + seatCost +
                '}';
    }
}
