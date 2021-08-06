
public class Exec {
    public static void main(String[] args) {
        System.out.println(more20(20));// →false
        System.out.println(more20(21)); // →true
        System.out.println(more20(22)); // →true
        System.out.println(more20(45)); // →false
        System.out.println(more20(41)); // →true
        // 20, 40, 60, 80
        /*
        Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
         */
    }

    public static boolean more20(int number) {
//        boolean кратность20 = number % 20 == 0;
        return number % 20 == 1 || number % 20 == 2;
    }
}
