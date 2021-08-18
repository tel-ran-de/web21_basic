public class HomeSolution {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6};
        System.out.println( getAverage(array) );
        System.out.println(getSumOfSecondsElement(array));
    }

    public static int getSumOfSecondsElement(int[] array) {
        int result = 0,
                i = 0;

        while (i < array.length) {
            result += array[i];
            i+=2;
        }

        return result;
    }

    public static int getSumOfArray(int[] array) {
        int result = 0,
                i = 0;

        while (i < array.length) {
            result += array[i];
            i++;
        }

        return result;
    }

    public static double getAverage(int[] array) {
        return (double) getSumOfArray(array) / array.length;
    }
}
