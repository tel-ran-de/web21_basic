import java.util.Random;

public class Functions {
    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.println( i );

        printNumber();

        int oleg = getNumber();
        int dmitriy = getNumber();

        toDo();

    }

    public static void toDo() {
        if ( isHaveMoney() ) {
            System.out.println("Деньги есть!!!");
        } else {
            System.out.println("Мы не идем в кино ;-(((");
        }
    }

    public static void printNumber() {
        int number = 10;
        System.out.println( number );
    }

    //  true -> true, !true -> false, !false -> true

    public static int getNumber() {

//        if (isHaveMoney()) {
//            Random rnd = new Random();
//            int a = rnd.nextInt(2000) + 3000;
//            return a;
//        } else {
//            return 0;
//        }

        if (!isHaveMoney()) {
            return 0;
        }
        Random rnd = new Random();
        int a = rnd.nextInt(2000) + 3000;
        return a;
    }

    public static boolean isHaveMoney() {
        int money = 0;
        return money > 0;
    }


    public static int getSomething(int a, int b, int c, int e) {

        if (e==0) {
          return 0;
        }

        int d = a+b;
        int d1 = d*c;
        int d2 = d1 - a;
//        if (e != 0) {
//            int d3 = d2 / e;
//        } else {
//            int d3 = 0;
//        }
        int d3 = d2 / e;
        return d3;
    }

}
