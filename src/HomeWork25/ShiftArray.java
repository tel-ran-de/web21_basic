package HomeWork25;

import java.util.Arrays;

public class ShiftArray {
    // Задача № 30
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("****  Задача № 30  ****");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        shiftArrayRight(arr);
        System.out.println("Сдвинутый массив: " + Arrays.toString(arr));
        shiftArrayRight(arr);
        System.out.println("Еще раз сдвинутый массив: " + Arrays.toString(arr));
    }

    public static void shiftArrayRight(int[] arr) {
        int a = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;
    }
}
