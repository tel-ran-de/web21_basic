package currency;

public class AppCurrency {
    public static void main(String[] args) {
//        Currency cur1 = new Currency("USD 100,43"); 100,50 100.50 100=00
//        Currency cur2 = new Currency("EUR 100500");
//        System.out.println( cur1 );
//        System.out.println( cur2 );

        Currency curr1 = new Currency("USD 100,43");
        Currency curr2 = new Currency("EUR 56000");
        Currency curr3 = new Currency("CNY 500=14");
        Currency curr4 = new Currency("NIS 5300");

        System.out.println(curr1);
        System.out.println(curr2);
        System.out.println(curr1.getInRubles());
        System.out.println(curr2.getInRubles());
        System.out.println(curr3.getInRubles());
//        System.out.println(curr4.getInRubles());


        CurrencyList myCur = new CurrencyList();
        myCur.add(curr1);
        myCur.add(curr2);
        myCur.add(curr3);
        myCur.add(curr4);

        System.out.println(myCur);
        System.out.println( myCur.getTotalSumInRoubles() );

    }
}
