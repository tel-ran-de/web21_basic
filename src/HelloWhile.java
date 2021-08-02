
public class HelloWhile {
    public static void main(String[] args) {
        myWhile();
    }

    public static void myWhile() {
        // пока
        // У Буратино 10 яблок, 2 яблока он отдал Мальвине
        int apple = 10;
        while (apple > 5) {
            // мы можем их раздавать направо и налево
            System.out.println("отдаём одно яблоко");
            apple = apple - 1;
            System.out.println("Осталось яблок на данный момент цикла" + apple);
        }

        System.out.println("В итоге яблок осталось");
        System.out.println("apple" + apple);
    }
}
