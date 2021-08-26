import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {

        /*

        for (Начальное значение; Условие; Приращение) {

            Команды - Инструкции

        }

        1. Переменной-счетчику (параметр) присваиваются начальное значение
        2. Проверяется условие, и если оно выполняется, то мы идем выполнять команды-инструкции
        3. Переменная-счетчик изменяется на указанную величину в Приращении
        4. Переходим к шагу 2

         */


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("=============");

        int i;

        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println(i);

        System.out.println("========");

        for (int a = 2; a < 100; ) {
            System.out.println("a = " + a);
            a = a * a;
            System.out.println("a*a = " + a);
        }

        System.out.println("==========");

        int b = 10;
        for (; b > 0; ) {
            System.out.println(b);
            b--;
        }

        System.out.println("=======");

        // Если нам при каком-то определенном условии (сгенерировалось случайное число = 0)
        // нужно выйти из цикла, используем команду break

        Random rnd = new Random();

        for (int j = 0; j < 1000000; j++) {
            int coins = rnd.nextInt(10);
            System.out.println("coins = " + coins);
            if (coins == 0) {
                System.out.println("Exit with " + j);
                break;
            }
            System.out.println("continue with " + j);
        }

        // Вложенный цикл на примере таблицы умножения
        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(j * k + "\t");
            }
            System.out.println();
//            System.out.println( k ); // Переменной k не существует
        }

//        System.out.println(j); // Переменной j не существует


        // Для чисел от 1 до 30. Если число кратное 3, то пишем Foo, Если число кратное 5 - Buzz, Если кратное 15 - FooBuzz,
        // Во всех остальных случаях - просто само число.
        // 15 - FooBuzz Правильно, а Foo Buzz FooBuzz - не правильно

        for (int j = 1; j <= 30; j++) {
            if (j % 15 == 0) {
                System.out.println("FuuBuzz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            } else if (j % 3 == 0) {
                System.out.println("Foo");
            } else {
                System.out.println(j);
            }
        }

    }
}
