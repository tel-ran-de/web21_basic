package homework03;

public class AreaRatio {
    public static void main(String[] args) {
        double blr, ukr;
        blr = 207600;
        ukr = 603628;

        findRatio(blr, ukr);
        findRatio(234234, 3453245);
        findRatio(2511, 891.8);
    }

    public static void findRatio(double areaOne, double areaTwo) {
        double result = areaOne / areaTwo;
        System.out.println(result);
    }
}
