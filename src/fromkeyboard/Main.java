package fromkeyboard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your name:");

        // String input
        String name = myScan.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("How old are you?");

        // Int input
        int age = myScan.nextInt();

        System.out.println( age < 25 ? "So young!" : "Wow! Great!" );

        // Double
        double salary = myScan.nextDouble();

        System.out.println(salary + "? Very nice!!!");

    }
}
