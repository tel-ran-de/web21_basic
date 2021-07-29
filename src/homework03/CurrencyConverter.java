package homework03;

public class CurrencyConverter {
    public static void main(String[] args) {
        exampleDollarToEuro(500);
    }

    public static void exampleDollarToEuro(double usd) {
        double euro = usd / 1.1;
        System.out.println("Получены доллары: " + usd + "$"
                + "\n" + "Выданы евро: " + euro + "€");
    }
}
