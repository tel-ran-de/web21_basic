public class Circle {
    public static void main(String[] args) {
        //findCircumference();
        findCircleArea();
    }

    public static void findCircleArea() {
        int radius = 45;
        double result = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга : " + result);
    }

    public static void findCircumference() {
        double radius = 7.3;
        double length = 2 * Math.PI * radius;
        System.out.println(length);
    }

    public static void myFinal() {
        // 1. double pi = 3.14;
        // константы
        // 2. final double PI = 3.14;
        final double PI = Math.PI;
        // площадь Германии
        final double GERMANY_SQUARE = 34_098_799;
        System.out.println(GERMANY_SQUARE);
    }
}
