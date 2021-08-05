/**
 * web_21M
 * 05 12 : 26
 */
public class Exec {
    public static void main(String[] args) {
        System.out.println(more20(20));// →false
        System.out.println(more20(21)); // →true
        System.out.println(more20(22)); // →true
        System.out.println(more20(45)); // →false
        System.out.println(more20(41)); // →true
        // 20, 40, 60, 80
    }

    public static boolean more20(int number) {
        return number % 20 == 2 || number % 20 == 1;
    }
}
