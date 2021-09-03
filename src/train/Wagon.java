package train;

public class Wagon {
    public String number;
    public WagonType type; // type = 1-Klass
    public int soldSeats;

    public Wagon(String number, WagonType type, int soldSeats) {
        this.number = number;
        this.type = type;
        this.soldSeats = soldSeats;
    }

    public int getAllSeats() {
        return this.type.seats;
    }

    public double getFullPrice() {
        return this.type.seatCost * this.type.seats;
    }

    public int getFreeSeats() {
        return this.type.seats - this.soldSeats;
    }

    public double getFullSold() {
        return this.soldSeats * this.type.seatCost;
    }

    public String toString() {
        return "Wagon{" +
                "number='" + number + '\'' +
                ", type=" + type +
                ", soldSeats=" + soldSeats +
                '}';
    }
}
