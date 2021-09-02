import person.scanner.Person;

import java.util.Scanner;


public class AppScanner {
    public static void main(String[] args) {
        // Ввести с клавиатуры Имя, Фамилия, Возраст и на основании введенных
        // данных создать объект типа Person

        Scanner myScan = new Scanner(System.in);
        System.out.println("Ваше имя?");
        String firstName = myScan.nextLine();

        System.out.println("Ваша фамилия?");
        String lastName = myScan.nextLine();

        System.out.println("Ваш возраст?");
        int age = myScan.nextInt();

        Person person = new Person(firstName, lastName, age);
        System.out.println(person);
        System.out.println("========");



        Person p1 = new Person();
        System.out.println("Ваше имя?");
        p1.firstName = myScan.nextLine();
        System.out.println("Ваша фамилия?");
        p1.lastName = myScan.nextLine();
        System.out.println("Ваш возраст?");
        p1.age = myScan.nextInt();

        System.out.println(p1);
        System.out.println("========");
        System.out.println( person );
    }
}
