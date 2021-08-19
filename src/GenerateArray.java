import java.util.Arrays;
import java.util.Random;

public class GenerateArray {
    public static void main(String[] args) {
//        Random rnd = new Random();
//        int a = rnd.nextInt();
//        System.out.println( a );
//        a = rnd.nextInt(20);
//        System.out.println(a);
//        sayHelloRandom();
        int[] array = getArray();
        int looking = getRandomNumber(100);
        System.out.println(Arrays.toString(array));
        System.out.println( looking );
        System.out.println( getHowManyTimes(array, looking) );
    }



    public static int getHowManyTimes(int[] array, int looking) {
        int result = 0;

        for (int element : array) {
            if (element >= looking) {
                result++;
            }
        }
        return result;
    }

    public static void sayHelloRandom() {
        for (int i = 0; i < getRandomNumber(10); i++) {
            System.out.println("Hello");
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
