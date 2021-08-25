public class SwitchCase {
    public static void main(String[] args) {
        /*
        Оператор выбора switch

        switch (Выражение) {
            case Константа1:
                Блок выполнения
                ...
                break;

            case Константа2:
                Блок выполнения
                ...
                break;
            ...

            default:
                Блок выполнения
                ...
        }
         */

        int month =7;
//        String sMonth = "янв";
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 7:
            case 6:
                System.out.println("Тоже лето");
                break;
            default:
                System.out.println("Тоже месяц");
                break;
        }



    }
}
