package HomeWorkSolutions;

import java.util.Locale;
import java.util.Scanner;

public class MyCalcuator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        double numOne = Double.parseDouble(getNumber());
        String calculation = getCalculation();
        System.out.println("Введите второе число:");
        double numTwo = Double.parseDouble(getNumber());
        //        int numTwo = getNumberTwo();
        System.out.println("Операция вычисления " + numOne + " " + calculation + " " + numTwo + " =");
        getResult(calculation, numOne, numTwo);
    }

    public static String getNumber() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число:");
        scanner.useLocale(Locale.US);
//
        String number = "Number";
        if (scanner.hasNextDouble()) { //Не работает при вводе числа с запятой
            number = scanner.next();
        }
        else {
            System.out.println("Повторите ввод!!!");
            scanner.next();
            number = getNumber();
        }
//        try {
//            number = scanner.next();
//        } catch (NumberFormatException e) {
//            System.out.println("Повторите ввод!!!");
//        }
        return number;
    }

    public static String getCalculation() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию вычисления ( + - / * % ):");
        String calc = scanner.next();
        return calc;
    }

//    public static int getNumberTwo() {
////        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите второе число:");
//        int number = scanner.nextInt();
//        return number;
//    }

    public static void getResult(String op, double num1, double num2) {
        double result;
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.println("==================\nОтвет: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("==================\nОтвет: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("==================\nОтвет: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("==================\nОтвет: " + result);
                break;
            case "%":
                result = num1 * num2 / 100;
                System.out.println("==================\nОтвет: " + result);
                break;
            default:
                System.out.println("Ошибка!!! Введенa неверная операция");
                break;
        }
    }
}
