public class WhileDoWhileLoop {
    public static void main(String[] args) {
        /*

        while (Условие) {
            Действия
        }

        do {
            Действия
        } while (Условие)

         */

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int a = -1;
        do {
            System.out.println(a);
            a--;
        } while (a > 0);

        // Разница между while и do-while состоит в том, что do-while
        // выполнит свои действия в любом случае минимум 1 раз

        // Таблица умножения с помощью цикла while

        int x = 1;
        while (x < 10) {
            int y = 1;
            while (y < 10) {
                System.out.print(x * y + "\t");
                y++;
            }
            x++;
            System.out.println();
        }
    }
}
