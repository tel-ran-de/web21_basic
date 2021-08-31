package HomeWork25;

import java.util.Arrays;
import java.util.Random;

public class CostOfWares {
    // Задача № 28
    public static void main(String[] args) {
        int[] waresCost = new int[20];
        fillArray(waresCost);
        System.out.println("****  Задача № 28  ****");
        System.out.println("Массив стоимости товаров: " + Arrays.toString(waresCost));
        System.out.println("Средняя стоимость всех видов товаров = " + findAverageArr(waresCost));
        System.out.println("Количество товаров со стоимостью меньше средней = " + findNumLessAverage(waresCost));
    }

    public static void fillArray(int[] arr) {
        // заполняет массив случайными значениями от 0 до 1000
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }
    }

    public static int findSumArr(int[] arr) {
        // возвращает сумму элементов массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double findAverageArr(int[] arr) {
        // возвращает среднее арифметическое
        return findSumArr(arr) * 1.0 / arr.length;
    }

    public static int findNumLessAverage(int[] arr) {
        // возвращает количество элементов массива, меньших среднего арифметического
        int res = 0;
        double average = findAverageArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                res++;
            }
        }
        return res;
    }
}
