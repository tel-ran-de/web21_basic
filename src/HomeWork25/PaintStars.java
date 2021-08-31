package HomeWork25;

public class PaintStars {
    // Задача № 10
    public static void main(String[] args) {
        int numStars = 20;
        System.out.println("****  Задача № 10  ****");
        for (int i = 1; i <= numStars; i++) {
            printStars(i);
        }
    }

    public static void printStars(int n) { // рисует линию из n символов *
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
