package homework03;

public class Circle {
    public static void main(String[] args) {
//        findCircleLength(30);
//        findCircleArea(10);
        double a = 10;
        double b = 10.1;
        System.out.println(a);
        System.out.println(b);
    }

    public static void findCircleLength(int radius) {
        double result = 2 * Math.PI * radius; // 1. нормальная длина окружности
        result = result * 100; // 2. умножаем результат на 100
        int myRound = (int) result; // 3. отсекаем оставшуюся дробь
        result = myRound; // 4. снова переводим значение из типа данных инт в дабл.
        System.out.println("Промежуточный результат резалта из четвёртого шага: " + result);
        result = result / 100; // 5. возвращаем в исходное значение, делим на 100
        System.out.println("Длина окружности: " + result + "см");
    }

    public static void findCircleArea(double radius) {
        int result = (int) (Math.PI * Math.pow(radius, 2));
        System.out.println("Площадь окружности: " + result);
    }
}
