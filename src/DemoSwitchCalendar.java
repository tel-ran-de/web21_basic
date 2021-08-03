public class DemoSwitchCalendar {
    public static void main(String[] args) {
        // 1 - > январь
        // октябрь - > 10;
        System.out.println(firstDemoSwitchCalendar(10));
    }

    public static String firstDemoSwitchCalendar(int monthNumber) {
        String monthStr = "";
        switch (monthNumber) {
            case 1:
                monthStr = "январь";
                break;
            case 2:
                monthStr = "февраль";
                break;
            case 3:
                monthStr = "март";
                break;
            case 4:
                monthStr = "апрель";
                break;
            case 5:
                monthStr = "май";
                break;
            case 6:
                monthStr = "июнь";
                break;
            case 7:
                monthStr = "июль";
                break;
            case 8:
                monthStr = "август";
                break;
            case 9:
                monthStr = "сентябрь";
                break;
            case 10:
                monthStr = "октябрь";
                break;
            case 11:
                monthStr = "ноябрь";
                break;
            case 12:
                monthStr = "декабрь";
                break;
            default:
                monthStr = "not valid a month number";
                break;
        }
        return monthStr;
    }
}
