package hwsolution6;

public class Exercise {
    public static void main(String[] args) {

//        System.out.println(findEven(13));
//        System.out.println(findEven(12));
//        evenNumberLine(7, 30);
//        System.out.println(multiple11(11));
//        System.out.println(multiple11(25));
        magiNumberLine(3000);
    }

    public static void magiNumberLine(int end) {
        int range = 3000;
        while (end > 0) {
            boolean condition = magicNumber(end);
            if (condition) {
                System.out.println(end);
            }
            end = end - 1;
            //end--;
        }
    }

    public static boolean magicNumber(int number) {
        return number % 32 == 30 && number % 58 == 44;
    }

    public static boolean multiple11(int number) {
        return number % 11 == 0;
    }

    public static boolean findOdd(int numberToProof) {
        // return numberToProof % 2 != 0;
        //  return numberToProof % 2 == 1;
        // это то число, которое не является чётным
        return !findEven(numberToProof);
    }

    public static boolean findEven(int numberToProof) {
        // делится на 2
        // делится на 2 без остатка
        // кратное двум
        // делится на два с остатком ноль
        // число модуло 2 равно нулю
        return numberToProof % 2 == 0;
    }

    public static void evenNumberLine(int start, int end) {
        while (end > start) {
            System.out.println("Проверка на чётность числа "
                    + end + findEven(end));
            end = end - 1;
        }
    }
}
