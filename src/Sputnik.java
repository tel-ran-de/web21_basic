public class Sputnik {
    public static void main(String[] args) {
        int a = 15;
        boolean permission01 = true;
        startRakete(5, permission01);
    }

    public static void startRakete(int speed, boolean doctorPermission) {
        final int SUPER_CONSTANT_G = 10;
        if (speed > SUPER_CONSTANT_G && doctorPermission) {
            System.out.println("Ракета улетела в космос");
            System.out.println("Выпустить пресс-релиз об успешном старте");
            System.out.println("Подготовить всех разработчиков к государственным наградам!");
        } else {
            System.out.println("Первоначального ускорения недостаточно");
            System.out.println("Ракета не может стартовать");
            System.out.println("Подготовить аварийные службы");
        }
    }
}
