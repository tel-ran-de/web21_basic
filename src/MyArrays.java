import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        // Массив - это нумерованный набор переменных одного типа
        // Переменная в массиве назыцвается элементом, а ее позиция в массиве называется индексом
        // [1,2,3,4,5,6,7,8,9,0]
        //  0 1 2 3 4 5 6 7 8 9

//        int[] x;
//        double[] y;

        int[] x = new int[10]; // создание массива из 10 элементов
        int[] y = new int[] {1,2,3,4,5,6,7,8,9}; // Создание массива из 9 элементов с наполнением от 1 до 9

        // По умолчанию.
        // numeric -> 0
        // boolean -> false
        // Object -> null

        String[] strings = new String[10];
        System.out.println(Arrays.toString(strings));

    }
}
