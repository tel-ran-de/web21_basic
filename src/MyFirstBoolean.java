public class MyFirstBoolean {
    public static void main(String[] args) {
        exampleTwo(true, false);
        exampleTwo(true, true);
        exampleTwo(false, false);
        exampleTwo(false, true);
    }

    public static boolean exampleTwo(boolean офицер1, boolean офицер2) {
        boolean result = офицер1 && офицер2;  // И , логическое умножение, AND, &
        //boolean result = офицер1 & офицер2;  // И , логическое умножение, AND, &
        // 1 - фолс , 2 - фолс
        // 1 - тру, 2 - фолс
        // 1 - фалс, 2 - тру
        // 1 - тру, 2 - тру
        return result;
    }


    public static void exampleOne() {
        int a = 2, b = 3;
        boolean bool1 = a >= b;
        boolean b2 = a < b;
        System.out.println(bool1);
        System.out.println(b2);
    }


}
