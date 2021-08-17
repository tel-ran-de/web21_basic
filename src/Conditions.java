public class Conditions {
    public static void main(String[] args) {
        isPositive(0);
        System.out.println( isPositiveBoolean(10) );
        printResult( isPositiveString(0) );

        printResult( Integer.toString(getSum(2,3)) );

        System.out.println( getSum(2,3) );


    }

    public static void isPositive(int number) {
        String word;
//        if (number >= 0) {
//            word = "Number is positive";
//        } else {
//            word = "Number is negative";
//        }
        word = (number >= 0) ? "Number is positive" : "Number is negative";

        System.out.println(word);
    }

    public static boolean isPositiveBoolean(int number) {
        return number >= 0;
    }

    public static String isPositiveString(int number) {
        return number > 0 ? "Number is positive" : (number < 0) ? "Number is negative" : "Number is 0";
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void printResult(String result) {
        System.out.println("====================");
        System.out.println(result);
        System.out.println("====================");
    }
}
