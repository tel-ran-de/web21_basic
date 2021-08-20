import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int [] ar1 = new int[] {1,2,3,2,1};
        int [] ar2 = new int[] {1,2,3,4,1};
        int [] ar3 = new int[] {1,2,3,3,2,1};
        int [] ar4 = new int[] {3};

//        System.out.println( isPalindrome1( ar1 ) );
//        System.out.println( isPalindrome1( ar2 ) );
//        System.out.println( isPalindrome1( ar3 ) );
//        System.out.println( isPalindrome1( ar4 ) );

        System.out.println( isPalindrome( ar1 ) );
        System.out.println( isPalindrome( ar2 ) );
        System.out.println( isPalindrome( ar3 ) );
        System.out.println( isPalindrome( ar4 ) );

    }

    public static boolean isPalindrome( int[] ar ) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != ar[ar.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome1(int [] array) {

        if (array.length == 1) return true;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0 ; j--) {
                if (array[i] != array[j] && i == array.length - 1 -j) {
                    return false;
                }
            }
        }

        return true;
    }

    /*
    Вариант Ирины
     */
    public static String massPoliCheck(int[] checkingMass) {
        System.out.println(Arrays.toString(checkingMass));
        int[] mass = new int[checkingMass.length];
        int j = checkingMass.length - 1;
        for (int i = 0; i < checkingMass.length; i++) {
            mass[i] = checkingMass[j];
            j--;
        }
        System.out.println(Arrays.toString(mass));// перевернутый массив
        String result="полиндром";
        for (int i = 0; i < checkingMass.length; i++) {
            if (checkingMass[i] != mass[i]) {
                result="не полиндром";
                break;
            }
        }
        return result;
    }
}
