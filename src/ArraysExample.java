public class ArraysExample {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, -4,5,0,7,8,9};
        System.out.println( getMinValue(array) );
    }

    public static int getMinValue(int[] array) {
        int minValue = array[0], // Предположим, что минимальный у нас первый элемент массива [1,2,3,4,5]
                i = 1; // Нас интересуют все элементы массива начиная со второго (по индексу 1)

        while (i < array.length) {
            if ( array[i] < minValue ) {
                minValue = array[i];
            }
            i++;
        }

        return minValue;
    }

    public static int getFirstIndexOfMinValue(int[] array) {
        int index = 0,
                i = 1; // [1,2,3,4,5]

        while (i < array.length) {
            if (array[i] < array[index]) {
                index = i;
            }
            i++;
        }

        return index;
    }

    public static int getArraysSum(int[] array) {
        int sum = 0,
                i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }
}
