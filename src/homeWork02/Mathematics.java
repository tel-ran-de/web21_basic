package homeWork02;

public class Mathematics {
    public static void main(String[] args) {
        square();
        rectangel();
        cube();
    }

    public static void square() {
        int a = 30;
        int perimeter = 4 * a;
        int area = a * a;
        System.out.println("----------*********** Квадрат *********** -----------");
        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Площадь квадрата: " + area);
    }

    public static void rectangel() {
        int a = 20;
        int b = 30;
        int perimeter = 2 * (a + b);
        int area = a * b;
        System.out.println("----------*********** прямоугольник *********** -----------");
        System.out.println("Периметр прямоугольника: " + perimeter);
        System.out.println("Площадь прямоугольника: " + area);
    }

    public static void cube() {
        int a = 30;
        int perimeter = 12 * a;
        int area = 6 * a * a;
        System.out.println("----------*********** Куб *********** -----------");
        System.out.println("Периметр куб: " + perimeter);
        System.out.println("Площадь куб: " + area);
    }

}
