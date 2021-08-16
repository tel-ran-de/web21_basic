public class Examples {
    public static void main(String[] args) {
        moduloFind(10, 6);
        moduloFind(10, 5);
        split();
        int e = 457;
        even(12);
        division7(17);
        split();
        findNumber(486);
        split();
        intPrintOut(256);
        split();
        System.out.println(reverseNumber(345678));
        split();
        intPrintOut(reverseNumber(78945));
    }

    public static void moduloFind(int a, int b) {
        if (a % b == 0) {
            System.out.println(a + " divide " + b + " = " + (a / b));
        } else {
            System.out.println(a + " not divide " + b);
        }
    }

    public static void split() {
        System.out.println("------------*************----------------");
    }

    public static void even(int a) {
        if (a % 2 == 0) {
            System.out.println("The " + a + " is even");
        } else {
            System.out.println("The " + a + " is not even");
        }
    }

    public static void division7(int a) {
        if (a % 10 == 7) {
            System.out.println(" There is 7 ");
        } else {
            System.out.println(" Ther is not 7 ");
        }

    }

    public static void findNumber(int a) {
        int a1 = a % 10;
        a = a / 10;
        int a2 = a % 10;
        a = a / 10;
        int a3 = a % 10;
        if (a1 > a2) {
            if (a1 > a3) {
                System.out.println("The biggest is " + a1);
            }
        } else if (a2 > a3) {
            System.out.println("The biggest is " + a2);
        } else {
            System.out.println("The biggest is " + a3);
        }
    }

    public static void intPrintOut(int a) {
        while (a != 0) {
            System.out.println(a % 10);
            a = a / 10;
        }
    }

    public static int reverseNumber(int a) {
        int b = 0;
        while (a != 0) {
            b = b * 10 + a % 10;
            a = a / 10;
        }
        return b;
    }

}
