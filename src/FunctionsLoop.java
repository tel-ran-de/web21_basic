public class FunctionsLoop {
    public static void main(String[] args) {
        System.out.println(getSum(103));
        app( getSum(100500) );
    }

    public static void app(int intGetSum) {

        System.out.println("a = " + intGetSum);

        for (int i = 0; i < 10; i++) {
            System.out.println( getSum(i + intGetSum) );

            /*
            0 -> 0 + 201000 = getSum(201000) -> 402000
            1 -> 1 + 201000 = getSum(201001) -> 402002
             */

        }
    }

    public static int getSum(int number) {
        number += number;
        return number;
    }
}
