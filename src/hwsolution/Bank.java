package hwsolution;

public class Bank {
    public static void main(String[] args) {
        System.out.println(getPercent(1000.0, 10.0, 7));
        System.out.println(getPercent(1000.0, 10.0, 1));
        System.out.println(getPercent(1000.0, 10.0, 2));
    }

    public static double getPercent(double amount, double interest, double year) {
        double result = amount;
/*        while (year > 0) {
            result = result + result * interest / 100;
            year--; //  year = year -1;
        }*/
        do {
            result = result + result * interest / 100;
            year--; //  year = year -1;
        } while (year > 0);
        return result;
    }
}
