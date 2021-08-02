package hw5;

public class Vitjaz {
    public static void main(String[] args) {
        // String left = "налево";
        // boolean forward = true;
        int sex = 0;
        int right = 1;
        int left = 2;
        int forward = 3;
    }

    public static void trueWay(int way) {
        if (way == 1) {
            System.out.println("Коня потеряешь");
        } else if (way == 2) {
            System.out.println("жизнь потеряешь");
        } else {
            System.out.println("Жену обретёшь");
        }
    }

    public static void trafficLight(String light) {
        if (light.equals("green")) {  // == equals. light == "green"
            System.out.println("Можно ехать");
        } else if (light.equals("yellow")) {  // light == "yellow"
            System.out.println("Приготовиться");
        } else {
            System.out.println("Остановись");
        }
    }
}
