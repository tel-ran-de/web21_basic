package HomeWork25;

import java.util.Arrays;
import java.util.Random;

public class NumReverse {
    // Задача № 15
    public static void main(String[] args) {
        int[] numRev = new int[6];

        System.out.println("****  Задача № 15  ****");
        // выполняем для случайно сгенерированных чисел
        for (int i = 0; i < 10; i++) {
            testNumReverse(numRev);
        }
        // проверяем для любого заданного числа a
        int a = 1;
//        int a = 999999;
        fillArrNumReverse(numRev, a);
        System.out.println("Для числа " + a + " массив заполнен: " + Arrays.toString(numRev));
    }

    public static void testNumReverse(int[] arr) {
        // показывает результаты работы для случайного числа num
        Random rnd = new Random();
        int num = rnd.nextInt(999999);
        fillArrNumReverse(arr, num);
        System.out.println("Для числа " + num + " массив заполнен: " + Arrays.toString(arr));
    }

    public static void fillArrNumReverse(int[] arr, int num) {
        // заполняет массив arr цифрами числа num в обратном порядке
        for (int i = 0; i < arr.length; i++) {
            arr[i] = findNumI(num, i);
        }
    }

    public static int findNumI(int num, int i) {
        // возвращает i-ю цифру числа num, отсчет с нуля
        int a = (int) Math.pow(10, i + 1);
        int b = (int) Math.pow(10, i);
        return num % a / b;
    }
}
