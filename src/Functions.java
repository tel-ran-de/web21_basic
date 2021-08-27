public class Functions {
    public static void main(String[] args) {
//        int a = 5;
//        getAnyAgain(a);
//
//        int d = getSum(a);
//        System.out.println( getSum(a) );
//        System.out.println( getSum(d) );

        System.out.println("Finish = " + getSum(getSum(getSum(getSum(2)))));

//        getAnyAgain(getSum(100));

    }

    public static void getAny() {
        int a = 10;
        System.out.println(a);
    }

    public static void getAnyAgain(int b) {
        System.out.println("Pit-Stop = " + b);
    }

    public static int getSum(int c) {
        c = c + c;
        getAnyAgain(c);
//        c = c + 10; // c += 10
        return c;
    }
}
