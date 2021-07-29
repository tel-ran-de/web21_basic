public class MySecondBoolean {
    public static void main(String[] args) {
        // Мама - тру -, Папа - тру
        // Мама и папа фолсе
        // Мама фалс, папа тру
        // мама тру и папа фолс
        // Дизъюнкция
        System.out.println(iceCream(false, false));
    }

    public static boolean iceCream(boolean mamaMoney, boolean papaMoney){
        return mamaMoney || papaMoney;
    }
}
