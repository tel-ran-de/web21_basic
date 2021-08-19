import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = getArray();
        System.out.println(Arrays.toString(array));
//        bubbleSort(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if ( array[i] > array[i + 1] ) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }

    }

    public static void bubbleSortFromSmall(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = array.length - 1 ; i  > j; i--) {
                if ( array[i] > array[i - 1] ) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }
        }

    }

    public static int[] getArray() {
        int count;
        do {
            count = getRandomNumber(25);
        } while (count < 3);
        int [] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = getRandomNumber(100);
        }
        return result;
    }

    public static int getRandomNumber(int number) {
        Random rnd = new Random();
        return (number == 0) ? rnd.nextInt() : rnd.nextInt(number);
    }
}
