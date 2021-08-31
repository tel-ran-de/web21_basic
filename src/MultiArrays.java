import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t", i*j);
            }
            System.out.println();
        }

        System.out.println("==========");

        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = i * j;
            }
        }
//        for (int i = 1; i < table.length; i++) {
//            for (int j = 1; j < table[i].length; j++) {
//                System.out.printf("%d\t", table[i][j]);
//            }
//            System.out.println();
//        }

        System.out.println( table[7][8] );
        System.out.println( table[4][6] );
        System.out.println( table[2][7] );
        System.out.println( table[7][3] );

        // 1. Составить программу расчета разности двух любых элементов двумерного массива

        System.out.println("Ex. 1");
        System.out.println( getResultOne(table, 8,7, 5,5 ) );
        System.out.println("===============");

        // 2. Дан двумерный массив целых чисел. Выяснить имеются ли числа кратные 5 в произвольной строке этого массива
        System.out.println("Ex. 2");
        int row = 9;
        System.out.println("In row "+row+" " + getDivByFive(table, row));
        System.out.println("===============");

        // 3. Дан двумерный массив. Вывести на экран все элементы третьей строки массива, начиная с последнего элемента этой
        //  строки
        System.out.println("Ex. 3");
        row = 3;
        printReverseRow(table, row);
        printReverseRowNew( table[row] );
        System.out.println("===============");

//        System.out.println(Arrays.deepToString(table));
//        System.out.println(Arrays.toString(table));

        printElementsOfArrayReverse();
    }

    public static void printReverseRowNew(int[] ints) {
        for (int m = ints.length - 1; m >= 0 ; m--) {
            System.out.printf("%d\t", ints[m]);
        }
        System.out.println();

    }

    public static void printReverseRow(int[][] table, int row) {
        for (int i = table[row].length - 1; i >= 0 ; i--) {
            System.out.printf("%d\t", table[row][i]);
        }
        System.out.println();
    }

    public static boolean getDivByFive(int[][] table, int row) {
        for (int k = 1; k < table[row].length; k++) {
            if ( table[row][k] % 11 == 0 ) {
                return true;
            }
        }
        return false;
    }

    public static int getResultOne(int[][] table, int i, int i1, int i2, int i3) {
//        int result = 0;
        return table[i][i1] - table[i2][i3];
    }

    public static void printElementsOfArrayReverse() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] revArray = new int[array.length];
        System.out.println("Данный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            revArray[revArray.length-i-1] = array[i];
        }
        System.out.println("Развёрнутый массив: " + Arrays.toString(revArray));

//
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        как сделать вывод в виде нового, развёрнутого массива с помощью Arrays.toString()?
//        System.out.println(Arrays.toString(array));
    }
}
