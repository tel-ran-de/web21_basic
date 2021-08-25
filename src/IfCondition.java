public class IfCondition {
    public static void main(String[] args) {
        /*

        if (условие которое возвращает тип Boolean) {
            Блок выполняемый при исстинном условии
        } [else {
            Блок выполняемый при ложном условии
        }]
         */

        int a = 21;
        int b = 49;

        if (a > b) {
            System.out.println("A больше B");
        } else {
            System.out.println( "A не больше B" );
        }

        boolean c = true;
        boolean d = false;

        if (d) {
            System.out.println("Все верно!!!");
        }

        int e = 10;
        int f = 10;

        if (e > f) {
            System.out.println("E больше F");
        } else if (e < f) {
            System.out.println("F больше E");
        } else {
            System.out.println("E Равно F");
        }

    }

    public static String divNumbers(int a, int b) {
//        if ( b!=0 ) {
//            return "Result = " + a/b;
//        } else {
//            return "Делить на ноль нельзя";
//        }

        if (b == 0) {
            return "Делить на ноль нельзя";
        }

        return "Result = " + a/b;
    }
}
