public class MyThirdBoolean {
    public static void main(String[] args) {
        // oma   true,  austria true     = false
        // oma   true ,  austria false   = true
        // oma  false ,  austria  true  = true
        // oma   false,  austria false  = false
        System.out.println(trueVacation(true, true));
        // Антиваленц, XOR, EXOR, Исключительное ИЛИ
    }

    public static boolean trueVacation(boolean oma, boolean austria) {
        return oma ^ austria;
    }
}
