public class MyLovelyInteger {
    public static void main(String[] args) {
        addition();
        functionOne();
    }

    public static void functionOne() {
        functionTwo();
        System.out.println("this is first function");
        functionThree();
    }

    public static void functionThree() {
        System.out.println("this is ТРЕТЬЯ function");
    }

    public static void functionTwo() {
        System.out.println("this is second function");
    }

    public static void addition() {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println("Хочу узнать сколько в нашей переменной C: " + c);
        b = b + 9;
        System.out.println(b);
        //System.out.println("Я " + "люблю " + "Java" + (186 + 7));
    }
}
