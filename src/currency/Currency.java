package currency;

public class Currency {
    private String code;
    private double amount;
    private final int [] values = {75, 85, 10};
    private final String [] codes = {"USD", "EUR", "CNY"};

    public Currency(String value) {
        this.code = value.substring(0,3);
        this.amount = Double.parseDouble(value.substring(4).replace(',', '.').replace('=', '.'));
    }

    public double getValueRubles() {
        int currIdx = getCurrIndex();
        return amount * ((currIdx > -1) ? values[getCurrIndex()] : 0);
    }

    public String getInRubles() {
        int currIdx = getCurrIndex();
        return currIdx > -1 ?
                getStringInRubles(codes[currIdx], amount * values[currIdx]) :
                "Данная валюта в нашем валютном пункте не принимается. Извините!";
    }

    private String getStringInRubles(String currency, double sum){

        return String.format("Сумма за %s получается %.2f рублей", currency, sum);
//        return "Сумма за " + currency + " получается " + sum + " рублей";
    }

    private int getCurrIndex(){
        for (int i = 0; i < codes.length; i++){
            if (code.equals(codes[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Currency - " + code + ", amount - " + amount;
    }
}
