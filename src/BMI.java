public class BMI {
    public static void main(String[] args) {
        findBMI();
    }

    public static void findBMI() {
        double weight, height;
        weight = 100;
        height = 175;
        height = height / 100;
        double result = weight / (height * height);
        System.out.println(result);
    }
}
