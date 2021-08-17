import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        // Массив - это нумерованный набор переменных одного типа
        // Переменная в массиве назыцвается элементом, а ее позиция в массиве называется индексом
        // [1,2,3,4,5,6,7,8,9,0] - элементы массива
        //  0 1 2 3 4 5 6 7 8 9 - индексы элементоы массива

//        int[] x;
//        double[] y;

        int[] x = new int[10]; // создание массива из 10 элементов
        int[] y = new int[] {1,2,3,4,5,6,7,8,9}; // Создание массива из 9 элементов с наполнением от 1 до 9

        // По умолчанию.
        // numeric -> 0
        // boolean -> false
        // Object -> null

//        String[] strings = new String[10];
//        System.out.println(Arrays.toString(strings));

        String word = Arrays.toString(y);
//        System.out.println( word );

//        System.out.println( y[5] ); // Элемент массива y с индексом 5
        int lengthOfArrayY = y.length;
//        System.out.println(lengthOfArrayY);

        // x = [0, 1, 4, 9 , ...] 10 элементов, в каждом элементе его значение = квадрату и индекса
        int idx = 0;
        while ( idx < x.length ) {
            x[idx] = idx*idx;
            idx++;
        }

//        System.out.println(Arrays.toString(x));

//        idx=0;
//        while ( idx < x.length ) {
//            System.out.println(x[idx]);
//            idx += 2; // idx = idx + 2; idx*=2 -> idx = idx * 2
//        }

        printArray(x);


    }
    public static void printArray(int[] array) {
        System.out.println("================");
        int i = 0;
        while (i < array.length) {
            System.out.println( "Element with index " + i + " equals " + array[i] );
            i++;
        }
        System.out.println("================");
        System.out.println("Total elements = " + i);
        System.out.println("================");
    }
}
