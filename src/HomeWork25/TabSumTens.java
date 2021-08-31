package HomeWork25;

public class TabSumTens {
    // Задача № 8
    public static void main(String[] args) {
        printTabSumTens();
    }

    public static void printTabSumTens() {
        System.out.println("****  Задача № 8  ****");
        System.out.print("    ");
        for (int i = 10; i < 100; i += 10) {
            System.out.print("  " + i);
        }
        System.out.println("\n   -------------------------------------");
        for (int i = 10; i < 100; i += 10) {
            System.out.print(i + " | ");
            for (int j = 10; j < 100; j += 10) {
                System.out.print(i + j);
                if ((i + j) >= 100) {
                    System.out.print(" ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
