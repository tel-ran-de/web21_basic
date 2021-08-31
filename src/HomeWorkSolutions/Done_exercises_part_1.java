package HomeWorkSolutions;

import java.util.Arrays;
import java.util.Random;

public class Done_exercises_part_1 {
    // Сделаны задачи №1,2,3,4,6,7,8,9,10,11,12,13,14(+-),24,25 [15]
    // Не сделаны:    №5,15,16,17,18,19,20,21,22,23,26,27,28,29,30 [15]
//     ???  №14. как задать диапазон от 163 до 190 включительно?
//     Не получился рандом. Выпадают числа, не входящие в указанный диапазон
    public static void main(String[] args) {
        System.out.println("1. Числа от 100 до 200, кратные трём: ");
        getIntegersDivisibleByThree();
        separator();
        System.out.println("2. Числа от A до B, кратные некоторому числу C (в данном случае, кратные семи): ");
        getIntegersDivisibleBySomeNumber();
        separator();
        System.out.println("3. Положительные нечетные числа, меньшие 50: ");
        getSumPositiveOddNumbersLessThan();
        separator();
        System.out.println("4. Целые положительные числа из промежутка от A до B (от 10 до 20), кратные четырём: ");
        getSumPositiveIntegersDivisibleBy();
        separator();
        System.out.println("6. Tаблицa сложения: ");
        printAdditionTable();
        separator();
        System.out.println("7. Tаблицa умножения:: ");
        printMultiplicationTable();
        separator();
        System.out.println("8. Tаблицa сложения десятков: ");
        printAdditionTableOfTens();
        separator();
        System.out.println("9. Горизонтальная линия из 80 символов \"*\": ");
        printHorizontalLineTheCharacters();
        separator();
        System.out.println("10. Горизонтальная линия из любого числа символов \"*\": ");
        printHorizontalLineAnyCharacters();
        separator();
        System.out.println("11. Сумма периметров и сумма площадей сторон двух треугольников: ");
        findSumOfPerimeterAndAreaTriangles();
        separator();
        System.out.println("12. Массив из восьми элементов:");
        fillArrayElements();
        separator();
        System.out.println("13. Массив из 15-ти случайных элементов целых значений,\n" +
                "лежащих в диапазоне от 0 до 10 включительно: ");
        fillArrayElementsRandomlyWithIntegerValues();
        separator();
        System.out.println("??? 14. Массив из ростов 12-ти человек (случайные целые значения),\n" +
                "лежащих в диапазоне от 163 до 190 включительно: ");
        fillArrayElementsRandomlyWithIntegerPersonHeights();
        separator();
        System.out.println("24. Напечатать все четные (по значению) элементы массива целых чисел: ");
        printAllEvenElementsInArray();
        separator();
        System.out.println("25. Напечатать все элементы массива целых чисел, оканчивающиеся нулем: ");
        printAllElementsEndingInZeroArray();
        separator();
    }

    //    1. Вывести на экран все целые числа от 100 до 200, кратные трем
    private static void getIntegersDivisibleByThree() {
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //    2. Вывести на экран все целые числа от a до b, кратные некоторому числу c.
    private static void getIntegersDivisibleBySomeNumber() {
        for (int i = 10; i <= 70; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    //    3. Найти сумму положительных нечетных чисел, меньших 50.
    private static void getSumPositiveOddNumbersLessThan() {
        int sum = 0;
        for (int i = 1; i < 50; i += 2) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Их сумма равна: " + sum);
    }

// второй вариант с if..else
//        for (int i = 0; i < 50; i++) {
//            if (i % 2 == 1) {
//                sum += i;
//                System.out.println(i);
//            }
//        }
//        System.out.println("Их сумма равна: " + sum);

    //    4. Найти сумму целых положительных чисел из промежутка от a до b, кратных четырем.
    private static void getSumPositiveIntegersDivisibleBy() {
        int sum = 0;
        for (int i = 10; i <= 20; i++) {
            if (i % 4 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Их сумма равна: " + sum);
    }

    //    6. Использовав вложенный цикл напечатать таблицу сложения
    private static void printAdditionTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + j + "\t");
            }
            System.out.println("\n");
        }
    }

    //     7.  Использовав вложенный цикл напечатать таблицу умножения
    private static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println("\n");
        }
    }

    //   8.  Использовав вложенный цикл напечатать таблицу сложения десятков (10 20 30 40 ... 90)
    private static void printAdditionTableOfTens() {
        for (int i = 0; i <= 100; i += 10) {
            for (int j = 0; j <= 100; j += 10) {
                System.out.print(i + j + "\t");
            }
            System.out.println("\n");
        }
    }

    //   9.  Составить функцию, "рисующую" на экране горизонтальную линию из 80 символов "*"
    private static void printHorizontalLineTheCharacters() {
        for (int i = 0; i <= 80; i++) {
            System.out.print(" * ");
        }
        System.out.print("\n");
    }

    //    10. Составить функцию, "рисующую" на экране горизонтальную линию из любого числа символов "*"
    private static void printHorizontalLineAnyCharacters() {
        int j = 30; // любое число символов "*"
        for (int i = 0; i <= j; i++) {
            System.out.print(" * ");
        }
        System.out.print("\n");
    }

    //    11. Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.
    private static void findSumOfPerimeterAndAreaTriangles() {
        // Стороны треугольника №1
        int a = 10;
        int b = 20;
        int c = 15;
        // Стороны треугольника №2
        int d = 45;
        int e = 55;
        int f = 65;
        double perimeter1 = a + b + c;
        double perimeter2 = d + e + f;
        double halfPer1 = (a + b + c) / 2;
        double halfPer2 = (d + e + f) / 2;
        double area1 = Math.sqrt(halfPer1 * (halfPer1 - a) * (halfPer1 - b) * (halfPer1 - c));
        double area2 = Math.sqrt(halfPer2 * (halfPer2 - d) * (halfPer2 - e) * (halfPer2 - f));
        double sumPer = perimeter1 + perimeter2;
        double sumArea = area1 + area2;

        System.out.println("Периметр треугольника №1: " + perimeter1);
        System.out.println("Периметр треугольника №2: " + perimeter2);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Площадь треугольника №1: " + area1);
        System.out.println("Площадь треугольника №2: " + area2);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Сумма периметров треугольников: " + sumPer);
        System.out.println("Сумма площадей треугольников: " + sumArea);
    }

    //    12. Заполнить массив из восьми элементов следующими значениями:
    //     первый элемент массива равен 37, второй — 0, третий — 50, четвертый — 46,
    //     пятый — 34, шестой — 46, седьмой — 0, восьмой —13
    private static int[] fillArrayElements() {
        int[] array1 = {37, 0, 50, 46, 34, 46, 0, 13};
        System.out.println(Arrays.toString(array1));
        return array1;
    }

    //    13. Заполнить массив из пятнадцати элементов случайным образом целыми значениями,
    //     лежащими в диапазоне от 0 до 10 включительно
    private static int[] fillArrayElementsRandomlyWithIntegerValues() {
        int[] array2 = new int[15];
        for (int i = 0; i < array2.length; i++) {
            // диапазон от 0 до 10 включительно
            array2[i] = getRandomNumber(10, 0);
//            array2[i] = getRandomNumber((10) - 20);
            //  ???  как задать ещё и отрицательные значения в диапазоне?
        }
        System.out.println(Arrays.toString(array2));
        return array2;
    }

    public static int getRandomNumber(int max, int min) {
//        int diff = max - min;
        Random rnd = new Random();
//        int range = rnd.nextInt((max - min + 1) + min);
//        range += min;
        return rnd.nextInt(max - min + 1) + min;
//        return rnd.nextInt(range);
//        return (rndNum == 0) ? rnd.nextInt() : rnd.nextInt(rndNum);
    }

    //    14. Массив предназначен для хранения значений ростов двенадцати человек.
    //     С помощью датчика случайных чисел заполнить массив целыми значениями,
    //     лежащими в диапазоне от 163 до 190 включительно

    //  ???   как задать диапазон от 163 до 190 включительно?
    private static int[] fillArrayElementsRandomlyWithIntegerPersonHeights() {
        int[] array3 = new int[12];
        for (int i = 0; i < array3.length; i++) {
//            int max = 190;
//            int min = 163;
            // ??? диапазон от 163 до 190 включительно
//            array3[i] = getRandomNumber((28) + 163);
            array3[i] = getRandomNumber(190, 163);
//            array3[i] = getRandomNumber(((190 + 1) - 163) + 163);
        }
        System.out.println(Arrays.toString(array3));
        return array3;
    }


    //     24. Дан массив целых чисел. Напечатать все четные (по значению) элементы
    private static void printAllEvenElementsInArray() {
        int[] array4 = {34, 67, 24, 79, 43, 57, 99, 423, 13, 5678, 432, 11, 44};
        System.out.println("Массив целых чисел: " + Arrays.toString(array4));
        for (int j : array4) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

//        второй вариант
//        for (int i = 0; i < array4.length; i++) {
//            if (array4[i] % 2 == 0) {
//                System.out.println(array4[i]);
//            }
//        }
    }

    //    25. Дан массив целых чисел. Напечатать все элементы, оканчивающиеся нулем
    private static void printAllElementsEndingInZeroArray() {
        int[] array4 = {34, 600, 24, 79, 43, 50, 99, 423, 13, 5670, 432, 11, 440};
        System.out.println("Массив целых чисел: " + Arrays.toString(array4));
        for (int j : array4) {
            if (j % 10 == 0) {
                System.out.println(j);
            }
        }
    }

    private static void separator() {
        System.out.println("----------======*****======----------");
    }
}
