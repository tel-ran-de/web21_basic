package HomeWork25;

import java.util.Arrays;

public class EqualsElementsOfArr {
    // Задача № 29
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 7, 2, 3, 4, 8, 9};
        int[] arr2 = new int[]{1, 4, 7, 2, 3, 5, 8, 9};
        System.out.println("****  Задача № 29  ****");
        printResult(arr1);
        printResult(arr2);
    }

    public static void printResult(int[] arr) {
        // вывод результатов проверки на наличие одинаковых элементов
        System.out.print("В массиве " + Arrays.toString(arr));
        if (isEqualElements(arr)) {
            System.out.println(" имеются одинаковые элементы.");
        } else {
            System.out.println(" одинаковых элементов нет.");
        }
    }

    public static boolean isEqualElements(int[] arr) {
        // определение наличия одинаковых элементов в массиве
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
