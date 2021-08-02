
public class Exercises {
    public static void main(String[] args) {
        // напишите метод для проверки числа чётное оно или нечётное
//        System.out.println(findEven(5)); // фалсе
//        System.out.println(findEven(4)); // true
        // От одного до десяти
        // как мне узнать какие из них чётные, а какие нечётные
        digitsLine(10);
    }

    public static void digitsLine(int number) {

        while (number >= 1) {
            System.out.println(
                    "Наше число: " + number + " выдало при проверке на чётность "
                            + findEven(number)
            );
            number = number - 1;
        }
    }

    public static boolean findEven(int number) {
        // modulo  - остаток деления
        return number % 2 == 0;
    }
}
