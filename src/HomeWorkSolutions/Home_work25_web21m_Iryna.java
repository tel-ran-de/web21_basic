package HomeWorkSolutions;

import java.util.Arrays;
import java.util.Random;

public class Home_work25_web21m_Iryna {

    public static void main(String[] args) {

        /*1. Вывести на экран все целые числа от 100 до 200, кратные трем*/
        System.out.println("------1.Вывести на экран все целые числа от 100 до 200, кратные трем---------");
        multiplesOf3();
        System.out.println();
        System.out.println();

        /*2.Вывести на экран все целые числа от a до b, кратные некоторому числу c.*/
        System.out.println("------2.Вывести на экран все целые числа от a до b, кратные некоторому числу c.---------");
        int a = 1;
        int b = 50;
        int c = 7;
        System.out.print("Числа от a=" + a + " до b=" + b + " кратные c=" + c + ": ");
        multiplesOfC(a, b, c);
        System.out.println();
        System.out.println();

        /* 3. Найти сумму положительных нечетных чисел, меньших 50.*/
        System.out.println("------3. Найти сумму положительных нечетных чисел, меньших 50.---------");
        System.out.println("Сумма положительных нечетных чисел, меньших 50 равна: " + summOfOdd());
        System.out.println();

        /* 4. Найти сумму целых положительных чисел из промежутка от a до b, кратных четырем.*/
        System.out.println("------4. Найти сумму целых положительных чисел из промежутка от a до b, кратных четырем.---------");
        System.out.println("Сумма целых положительных чисел из промежутка от a=" + a + " до b=" + b + " кратные 4 равна: " + summOfMultiplesOf4(a, b));
        System.out.println();

        /*5.  ** Определить количество натуральных чисел из интервала от 100 до 500, сумма цифр которых равна 15.*/
        System.out.println("------5.** Определить количество натуральных чисел из интервала от 100 до 500, сумма цифр которых равна 15.---------");
        System.out.println("Kоличество натуральных чисел из интервала от 100 до 500, сумма цифр которых равна 15, равно: " + summOfDigitsIs15());
        System.out.println();

        /*6.Использовав вложенный цикл напечатать таблицу сложения*/
        System.out.println("------6.Таблица сложения---------");
        additionTable();
        System.out.println();

        /*7.Использовав вложенный цикл напечатать таблицу умножения*/
        System.out.println("------7.Таблица умножения---------");
        multiplicationTable();
        System.out.println();

        /* 8.Использовав вложенный цикл напечатать таблицу сложения десятков (10 20 30 40 ... 90)*/
        System.out.println("------8.Таблица сложения десятков (10 20 30 40 ... 90)---------");
        additionTableOfTens();
        System.out.println();

        /* 9.Составить функцию, "рисующую" на экране горизонтальную линию из 80 символов "*"*/
        System.out.println("------9.Горизонтальная линия из 80 символов \"*\"---------");
        lineOf80Stars();
        System.out.println();

        /* 10.Составить функцию, "рисующую" на экране горизонтальную линию из любого числа символов "*"*/
        int k = 77;
        System.out.println("------10.Горизонтальная линия из K=" + k + " символов \"*\"---------");
        lineOfStars(k);
        System.out.println();

        /* 11-Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.*/
        System.out.println("------11.Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.---------");
        int a1 = 2, a2 = 3, a3 = 4, b1 = 5, b2 = 6, b3 = 7;
        System.out.println("Сумма  периметров двух треугольников со сторонами " + a1 + "," + a2 + "," + a3 + " и " + b1 + "," + b2 + "," + b3 + " равна: " + (perim(a1, a2, a3) + perim(b1, b2, b3)));
        System.out.println("Сумма  площадей двух треугольников со сторонами " + a1 + "," + a2 + "," + a3 + " и " + b1 + "," + b2 + "," + b3 + " равна: " + (area(a1, a2, a3) + area(b1, b2, b3)));
        System.out.println();

        /* 12.Заполнить массив из восьми элементов следующими значениями: первый элемент массива равен 37,
         второй — 0, третий — 50, четвертый — 46, пятый — 34, шестой — 46, седьмой — 0, восьмой —13*/
        System.out.println("------12.Заполнить массив из восьми элементов следующими значениями: первый элемент массива равен 37,\n" +
                "  второй — 0, третий — 50, четвертый — 46, пятый — 34, шестой — 46, седьмой — 0, восьмой —13---------");
        int[] array = {37, 0, 50, 46, 34, 46, 0, 13};
        System.out.println(Arrays.toString(array));
        System.out.println();

        /* 13.Заполнить массив из пятнадцати элементов случайным образом целыми значениями, лежащими
        в диапазоне от 0 до 10 включительно*/
        System.out.println("------13.Заполнить массив из пятнадцати элементов случайным образом целыми значениями, лежащими\n" +
                "        в диапазоне от 0 до 10 включительно------");
        int len13 = 15;
        int bou13 = 11;
        System.out.println(Arrays.toString(getArrayOfNElementsWithBound(len13, bou13)));
        System.out.println();

        /* 14.Массив предназначен для хранения значений ростов двенадцати человек.*/
        /* С помощью датчика случайных чисел заполнить массив целыми значениями, лежащими*/
        /*  в диапазоне от 163 до 190 включительно*/
        System.out.println("------14.Массив значений ростов от 163 до 190 двенадцати человек ------");
        System.out.println(Arrays.toString(getArrayOfHeightOf12People()));
        System.out.println();

        /* 15.** Дано натуральное число n (n <= 999999). Заполнить массив его цифрами, расположенными
        в обратном порядке (первый элемент равен последней цифре, второй — предпоследней и т. д.)*/
        System.out.println("------15.** Дано натуральное число n (n <= 999999). Заполнить массив его цифрами, расположенными в обратном порядке ------");
        int n = getN();
        System.out.println("Случайное 6-значное число n равно: " + n);
        System.out.println(" Обратный массив цифр числа n:" + Arrays.toString(getReversArrayOfDigits(n)));
        System.out.println();

        /* 16.Составить функцию вывода на экран любого элемента массива по его индексу*/
        System.out.println("------16.Составить функцию вывода на экран любого элемента массива по его индексу ------");
        int[] arr = {11, 15, 47, 55, 26, 25, 77};
        System.out.println("Массив: " + Arrays.toString(arr));
        int lenOfArr = arr.length;
        int i = getRandomNumberWithBoard(lenOfArr);
        printElement(arr, i);
        System.out.println();

        /* 17.Вывести элементы массива на экран в обратном порядке*/
        System.out.println("------17.Вывести элементы массива на экран в обратном порядке ------");
        System.out.println(Arrays.toString(arr));
        reversArray(arr);
        System.out.println();
        System.out.println();

        /* 18.Дан массив. Составить программу расчета среднего арифметического двух любых элементов массива*/
        System.out.println("------18.Дан массив. Составить программу расчета среднего арифметического двух любых элементов массива ------");
        int[] array18 = getRandomArray();
        System.out.println(Arrays.toString(array18));
        int lenOfArray18 = array18.length;
        int ind1 = getRandomNumberWithBoard(lenOfArray18);
        int ind2;
        do {
            ind2 = getRandomNumberWithBoard(lenOfArray18);
        } while (ind1 == ind2);
        System.out.printf("среднее арифметическое " + ind1 + " и " + ind2 + " элементов равно: %.2f\n ", getAverage(array18[ind1], array18[ind2]));
        System.out.println();
        System.out.println();

        /* 19.Дан массив целых чисел. Выяснить является ли s-й элемент массива положительным числом*/
        System.out.println("------19.Дан массив целых чисел. Выяснить является ли s-й элемент массива положительным числом ------");
        int[] array19 = getRandomArray();
        System.out.println(Arrays.toString(array19));
        int lenOfArray19 = array19.length;
        int s = getRandomNumberWithBoard(lenOfArray19);
        System.out.println(s + " элемент есть " + positivOrNegativElementOfArray(array19, s));
        System.out.println();


        /* 20.Дан массив целых чисел. Выяснить является ли k-й элемент массива четным числом*/
        System.out.println("------20.Дан массив целых чисел. Выяснить является ли k-й элемент массива четным числом ------");
        int[] array20 = getRandomArray();
        System.out.println(Arrays.toString(array20));
        int lenOfArray20 = array20.length;
        int kIndex = getRandomNumberWithBoard(lenOfArray20);
        System.out.println(kIndex + " элемент есть " + evenOrOdd(array20, kIndex));
        System.out.println();

        /* 21.Дан массив. Все его элементы увеличить в 2 раза*/
        System.out.println("------21.Дан массив. Все его элементы увеличить в 2 раза ------");
        int[] array21 = getRandomArray();
        System.out.println(Arrays.toString(array21));
        System.out.println(Arrays.toString(arrayMultiply2(array21)));
        System.out.println();

        /* 22.Выяснить, верно ли, что сумма элементов массива есть неотрицательное число*/
        System.out.println("------22.Выяснить, верно ли, что сумма элементов массива есть неотрицательное число ------");
        int[] array22 = getRandomArray();
        System.out.println(Arrays.toString(array22));
        int sumOfElements = getSumOfElements(array22);
        System.out.print("Утверждение, что сумма элементов массива (равная " + sumOfElements + ") есть неотрицательное число, ");
        System.out.println(posOrNegNumber(sumOfElements) == "положительный" ? "верно." : "ложно.");
        System.out.println();


        /* 23.В массиве хранится информация о баллах, полученных спортсменом-десятиборцем в каждом
         из десяти видов спорта. Для выхода в следующий этап соревнований общая сумма баллов должна
          превысить некоторое известное значение. Определить, вышел ли данный спортсмен в следующий
          этап соревнований*/
        System.out.println("------23.Определить, вышел ли  спортсмен в следующий этап соревнований ------");
        int len23 = 10;
        int bou23 = 20;
        int toTheNextStage = 110;
        int[] array23 = getArrayOfNElementsWithBound(len23, bou23);
        System.out.println(Arrays.toString(array23));
        int resultOfStage = getSumOfElements(array23);
        System.out.println("Результат этапа: " + resultOfStage + " баллов");
        System.out.println("Необходимо набрать " + toTheNextStage + " баллов");
        System.out.println(resultOfStage >= toTheNextStage ? "спортсмен вышел в следующий этап соревнований" : "спортсмен не вышел в следующий этап соревнований");
        System.out.println();


        /* 24.Дан массив целых чисел. Напечатать все четные (по значению) элементы*/
        System.out.println("------24.Дан массив целых чисел. Напечатать все четные (по значению) элементы ------");
        int[] array24 = getRandomArray();
        System.out.println(Arrays.toString(array24));
        System.out.print("четные (по значению) элементы :");
        printOfEvenValuesOfArrayElements(array24);
        System.out.println();
        System.out.println();


        /* 25.Дан массив целых чисел. Напечатать все элементы, оканчивающиеся нулем*/
        System.out.println("------25.Дан массив целых чисел. Напечатать все элементы, оканчивающиеся нулем ------");
        int[] array25 = getRandomArray();
        System.out.println(Arrays.toString(array25));
        System.out.print("элементы, оканчивающиеся нулем :");
        printOfValuesOfArrayElementsMultiple10(array25);
        System.out.println();
        System.out.println();


        /* 26.В массиве хранятся сведения об общей стоимости товаров, проданных фирмой за каждый день марта.
          Определить количество дней, в которые стоимость проданных товаров превысила значение s*/
        System.out.println("------26.В массиве хранятся сведения об общей стоимости товаров, проданных фирмой за каждый день марта. ------");
        System.out.println("Определить количество дней, в которые стоимость проданных товаров превысила значение s");
        int len26 = 30;
        int bou26 = 10500;
        int s26 = 8000;
        int[] array26 = getArrayOfNElementsWithBound(len26, bou26);
        System.out.println(Arrays.toString(array26));
        System.out.println("значение s: " + s26);
        System.out.println("количество дней, в которые стоимость проданных товаров превысила значение s равно: " + gudDays(array26, s26));
        System.out.println();


        /*  27.Найти среднее арифметическое элементов массива, больших числа 10*/
        System.out.println("------27.Найти среднее арифметическое элементов массива, больших числа 10 ------");
        int len27 = 10;
        int bou27 = 20;
        int s27 = 10;
        int[] array27 = getArrayOfNElementsWithBound(len27, bou27);
        System.out.println(Arrays.toString(array27));
        System.out.printf("среднее арифметическое элементов массива, больших числа 10 равно: %.2f\n ", getAverageOfElementsGreaterThenNumber(array27, s27));
        System.out.println();


        /*  28.В массиве записана информация о стоимости 20 видов товара. Определить, сколько видов
        товара имеют стоимость, меньшую, чем средняя стоимость всех видов товара*/

        System.out.println("------28.В массиве записана информация о стоимости 20 видов товара. Определить, сколько видов\n" +
                "        товара имеют стоимость, меньшую, чем средняя стоимость всех видов товара ------");
        int len28 = 20;
        int bou28 = 20;
        int number = -1;
        int[] array28 = getArrayOfNElementsWithBound(len28, bou28);
        System.out.println(Arrays.toString(array28));
        double averagePrice = getAverageOfElementsGreaterThenNumber(array28, number);
        System.out.printf("средняя стоимость всех видов товара:  %.2f\n ", averagePrice);
        System.out.println(getCheapGoods(array28, averagePrice) + " видов товара имеют стоимость, меньшую, чем средняя стоимость");
        System.out.println();


        /*  29.Определить, имеются ли в одномерном массиве одинаковые элементы*/
        System.out.println("------29.Определить, имеются ли в одномерном массиве одинаковые элементы------");
        int len29 = 5;
        int bou29 = 10;
        int[] array29 = getArrayOfNElementsWithBound(len29, bou29);
        System.out.println(Arrays.toString(array29));
        System.out.println(sameElements(array29) == true ? "в одномерном массиве одинаковые элементы имеются" : "в одномерном массиве одинаковые элементы HЕ имеются");


        System.out.println();
        /* 30.*** Переставить последний элемент массива на место первого. При этом первый,
         второй, ..., предпоследний элементы сдвинуть вправо на 1 позицию*/
        System.out.println("------30.*** Переставить последний элемент массива на место первого. При этом первый,\n" +
                "         второй, ..., предпоследний элементы сдвинуть вправо на 1 позицию------");
        int len30 = 5;
        int bou30 = 10;
        int[] array30 = getArrayOfNElementsWithBound(len30, bou30);
        System.out.println(Arrays.toString(array30));
        int lastElement = array30[array30.length - 1];
        getArrayAfterRightShift(array30);
        array30[0] = lastElement;
        System.out.println(Arrays.toString(array30));

    }

    public static void multiplesOf3() {
        for (int i = 100; i < 200; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "; ");
            }
        }
    }

    public static void multiplesOfC(int x, int y, int z) {
        for (; x < y; x++) {
            if (x % z == 0) {
                System.out.print(x + "; ");
            }
        }
    }

    public static int summOfOdd() {
        int summ = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                summ = summ + i;
            }
        }
        return summ;
    }

    public static int summOfMultiplesOf4(int x, int y) {
        int summ = 0;
        for (; x < y; x++) {
            if (x % 4 == 0) {
                summ = summ + x;
            }
        }
        return summ;
    }

    public static int summOfDigitsIs15() {
        int k = 0;
        for (int i = 100; i < 500; i++) {
            int summ15 = 0;
            summ15 = i % 10 + i / 10 % 10 + i / 100;
            if (summ15 == 15) {
                k = k + 1;
            }
        }
        return k;
    }

    public static void additionTable() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + j + "\t");
            }
            System.out.println();
        }
    }

    public static void multiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void additionTableOfTens() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i * 10 + j * 10 + "\t");
            }
            System.out.println();
        }
    }

    public static void lineOf80Stars() {
        for (int i = 0; i < 80; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void lineOfStars(int j) {
        for (int i = 0; i < j; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static int perim(int x1, int x2, int x3) {
        int perimetr = x1 + x2 + x3;
        return perimetr;
    }

    public static int area(int x1, int x2, int x3) {
        int area = x1 * x2 * x3;
        return area;
    }

    public static int[] getArrayOfNElementsWithBound(int len, int bou) {
        int[] mass = new int[len];
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            mass[i] = rnd.nextInt(bou);
        }
        return mass;
    }

    public static int[] getArrayOfHeightOf12People() {
        int[] mass = new int[12];
        Random rnd = new Random();
        for (int i = 0; i < 12; i++) {
            mass[i] = rnd.nextInt(190 - 163 + 1) + 163;
        }
        return mass;
    }

    public static int getN() {
        Random rnd = new Random();
        int x = rnd.nextInt(999999 - 100000 + 1) + 100000;
        return x;
    }

    public static int[] getReversArrayOfDigits(int n) {
        int[] mass = new int[6];

        for (int i = 0; i < 6; i++) {
            mass[i] = n % 10;
            n = n / 10;
        }
        return mass;
    }

    public static void printElement(int[] mass, int index) {
        System.out.println("Элемент массива по (рандомному) индексу " + index + " имеет значение: " + mass[index]);
    }

    public static int getRandomNumberWithBoard(int board) {
        Random rnd = new Random();
        int number = rnd.nextInt(board);
        return number;
    }

    public static void reversArray(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }

    public static int[] getRandomArray() {
        int n = 0;
        Random rnd = new Random();
        do {
            n = rnd.nextInt(12);
        } while (n < 5);

        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(100 + 100 + 1) - 100;
        }
        return mass;
    }

    public static double getAverage(int x, int y) {
        double aver = ((double) x + y) / 2;
        return aver;
    }

    public static String positivOrNegativElementOfArray(int[] mass, int ind) {
        String str = posOrNegNumber(mass[ind]);
        return str;
    }

    public static String posOrNegNumber(int number) {
        String str = "";
        if (number < 0) {
            str = "отрицательный";
        } else {
            str = "положительный";
        }
        return str;
    }

    public static String evenOrOdd(int[] mass, int ind) {
        String str = "";
        if (mass[ind] % 2 == 0) {
            str = "четный";
        } else {
            str = "нечетный";
        }
        return str;
    }

    public static int[] arrayMultiply2(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = mass[i] * 2;
        }
        return mass;
    }

    public static int getSumOfElements(int[] mass) {
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            summ = summ + mass[i];
        }
        return summ;
    }

    public static void printOfEvenValuesOfArrayElements(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                System.out.print(mass[i] + ", ");
            }
        }
    }

    public static void printOfValuesOfArrayElementsMultiple10(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 10 == 0) {
                System.out.print(mass[i] + ", ");
            }
        }
    }

    public static int gudDays(int[] mass, int s) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > s) {
                result = result + 1;
            }
        }
        return result;
    }

    public static double getAverageOfElementsGreaterThenNumber(int[] mass, int number) {

        double summ = 0;
        int k = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > number) {
                summ = summ + mass[i];
                k++;
            }
        }
        if (k == 0) {
            return 0;
        } else {
            return summ / k;
        }
    }

    public static int getCheapGoods(int[] mass, double anyNumber) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < anyNumber) {
                result++;
            }
        }
        return result;
    }

    public static boolean sameElements(int[] mass) {
        boolean result = false;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void getArrayAfterRightShift(int[] mass) {
        for (int i = mass.length - 1; i > 0; i--) {
            mass[i] = mass[i - 1];
        }
    }


}
