public class HelloDoubleAndFloat {
    public static void main(String[] args) {
        //helloMyLovelyFloat();
        helloMyLovelyDouble();
    }

    public static void helloMyLovelyFloat() {
        // Определение, объявление, присвоение (инициализация)
        // Definition, declaration, initialization
        float a = 3.5f;
        float b = 10.45F;
        float c = (float) 23.345;
        float d = a + b + c;
        System.out.println("a + b + c: " + d);
        // ctrl(cmd) + alt + L
    }

    public static void helloMyLovelyDouble() {
        double d1 = 3.14;
        int i = 40;
        double d2 = 10;
        System.out.println(d2);

        int a = 10;
        int b = 3;
        double d10 = 10;
        double d3 = 3;
        int result = a / b;
        double doubleResult = d10 / d3;
        System.out.println(result);
        System.out.println(doubleResult);
    }

}
