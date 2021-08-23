import java.util.Random;

public class Variable {

    public static void main(String[] args) {

        int a; // Объявление переменной. Выделяем 4 байта памяти для целого числа и связываем их
        // с неким именем 'a' внутри метода main

        a = 5; // Инициализация перменной  'a'  числом 5 (Операция присвоения)

        int b = 6;
        b = 7; // Переинициализация переменной

        System.out.println(a);
        System.out.println(b);

        aFunc();

        int c = 100500;
        System.out.println(c);
//
//        for (int i = 0; i <= 5; i++) { // Об этом в циклах :-)))
//            aFunc();
//        }


//        System.out.println( aa ); // Ошибка - нет такой переменной 'aa' внутри нашей функции main

        System.out.println(a + b); // 12
        System.out.println(a - b); // -2
        System.out.println(a * b); // 35
        System.out.println(a / b); // 0
        System.out.println(b / a); // 1
        System.out.println((double)b / a); // 1.4 кастование или Приведение типа (integer to double)
        System.out.println(b / (a*1.0)); // 1.4 кастование или Приведение типа (integer to double)

        System.out.println( (int) (1.8/2) ); // 0 Убъет правую от точки часть числа
        System.out.println( (int) (2.5/2) ); // 1 Убъет правую от точки часть числа

        int number = 12345;
        System.out.println( number % 10 ); // 5 - Мы можем получить откусанную цифру
        System.out.println( number / 10 ); // 1234 - Мы можем типа откусить правую последнюю цифру от нашего числа

        System.out.println( number % 2 ); // Мы можем определить четность числа - number % 2 == 0 четное


        Random rnd = new Random();
        System.out.println( rnd.nextInt() ); // Случайное число от - минимального Int до максимального Int
        System.out.println( Integer.MIN_VALUE );
        System.out.println( Integer.MAX_VALUE );

        System.out.println( rnd.nextInt(100) ); // Случайное число от - 0 до параметра не включая!!! Параметр только положительный!!!
        System.out.println( rnd.nextInt(200) - 100 ); // Получаем число от 0 до 200 и вычитаем из него 100
        System.out.println( rnd.nextInt(180) - 30 ); // Получаем число от 0 до 200 и вычитаем из него 100

        int random = rnd.nextInt(1000);


        // Произвольное количество переменных целого типа (не менее 5).
        // 1. Заполнить их на половину руками а второую половину случайным числом.
        // 2. Посчитать их сумму и среднее арифмитическое
        // 3. Четное или не четное их количество



    }

    public static void aFunc() {
        int aa = 100;
        System.out.println(aa);
        bFunc();
        System.out.println("World");
    }

    public static void bFunc() {
        System.out.println("Hello!!!");
//        aFunc();
    }

//    public static double avg(int[] array) {
//        double sum = 0.0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return sum / array.length;
//    }
}
