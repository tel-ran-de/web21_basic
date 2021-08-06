package hwsolution;

//Если задано неотрицательное число "num",
// верните true, если num находится в пределах 2 от кратного 10.
public class NearTen {
    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 == 8 || num % 10 == 9;
    }

    public static boolean nearTenTwo(int num) {
        return num % 10 <= 2 || 10 - num % 10 <= 2;
    }

    public static void main(String[] args) {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));
    }
}
