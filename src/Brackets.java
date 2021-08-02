public class Brackets {
    public static void main(String[] args) {
        //exampleOne(100);
        exampleTwo(50);
        // ctrl + alt + l
    }

    private static void exampleTwo(int speed) {

        if (speed > 100) {
            System.out.println("Полетим на луну");
            System.out.println("Эта строчка выполнится в любом случае");
        }
    }

    private static void exampleOne(int speed) {
        // 1.
        if (speed > 100) {
            // выполнение кода
        } else {
            // выполнение
        }

        // 2.
        if (speed > 100) System.out.println("KOKOJTOKOD");
            // выполнение кода
        else System.out.println();
        // выполнение

        // 3.
        if (speed > 100)
            System.out.println("KOKOJTOKOD");
            // выполнение кода
        else
            System.out.println();
    }
}
