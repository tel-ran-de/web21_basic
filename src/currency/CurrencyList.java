package currency;

import java.util.ArrayList;

public class CurrencyList {
    private ArrayList<Currency> list = new ArrayList<>();

    public CurrencyList() {
    }

    public void add(Currency curr1) {
        list.add(curr1);
    }

    public double getTotalSumInRoubles() {
        double sum = 0;
        for (Currency curr : list) {
            sum += curr.getValueRubles();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "CurrencyList{" +
                "list=" + list +
                '}';
    }
}
