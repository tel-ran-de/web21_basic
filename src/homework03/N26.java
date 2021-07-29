package homework03;

public class N26 {
    public static void main(String[] args) {
        bankDeposit(1000, 3.5, 7);
        bankDeposit(1000, 5, 20);
    }

    public static void bankDeposit(double amount, double perCent, int year) {
        double result = amount + amount / 100 * perCent * year;
        System.out.println(result);
    }
}
