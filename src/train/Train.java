package train;

import java.util.Arrays;

public class Train {
    private String number;
    public Wagon[] wagons;
    private int wagonsCount;

    public Train(String number, int wagonsCount) {
        this.number = number;
        this.wagonsCount = wagonsCount;
        this.wagons = new Wagon[wagonsCount];
    }


    private int getTotalSeats() {
        int sum = 0;
        for (Wagon w : wagons) {
            sum += w.getAllSeats();
        }
        return sum;
    }

    private double getTotalFullPrice() {
        int sum = 0;
        for (Wagon w : wagons) {
            sum += w.getFullPrice();
        }
        return sum;
    }

    private int getTotalFreeSeats() {
        int sum = 0;
        for (Wagon w : wagons) {
            sum += w.getFreeSeats();
        }
        return sum;
    }

    private double getTotalFullSold() {
        int sum = 0;
        for (Wagon w : wagons) {
            sum += w.getFullSold();
        }
        return sum;
    }

    public String getReport() {
        String report = "=====================\n";
        report += "Поезд № " + this.number + "\n";
        report += "Общее количество мест - " + this.getTotalSeats() + "\n";
        report += "Общая стоимость всех мест - " + this.getTotalFullPrice() + "\n";
        report += "Всего свободных мест - " + this.getTotalFreeSeats() + "\n";
        report += "Всего получено в кассу вокзала - " + this.getTotalFullSold() + "\n";
        report += "=======================\n";
        return report;
    }


    public String toString() {
        return "Train{" +
                "number='" + number + '\'' +
                ", wagons=" + Arrays.toString(wagons) +
                ", wagonsCount=" + wagonsCount +
                '}';
    }
}
