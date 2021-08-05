package hwsolution07;

import java.util.Locale;

public class DemoMonthStringToInt {
    public static void main(String[] args) {
        System.out.println(findMonthNumber("Январь")); //->> 1
        System.out.println(findMonthNumber("ЯнВаРь")); //->> 1
        System.out.println(findMonthNumber("январь")); //->> 1
        System.out.println(findMonthNumber("октябрь")); //->> 10
        String age = "48";
    }


    public static int findMonthNumber(String strMonth) {
        //strMonth = strMonth.toLowerCase();
        int result = 0;
        switch (strMonth.toLowerCase()) {
            case "январь":
                result = 1;
                break;
            case "февраль":
                result = 2;
                break;
            case "март":
                result = 3;
                break;
            case "апрель":
                result = 4;
                break;
            case "май":
                result = 5;
                break;
            case "июнь":
                result = 6;
                break;
            case "июль":
                result = 7;
                break;
            case "август":
                result = 8;
                break;
            case "сентябрь":
                result = 9;
                break;
            case "октябрь":
                result = 10;
                break;
            case "ноябрь":
                result = 11;
                break;
            case "декабрь":
                result = 12;
                break;
            default:
                result = -1;
                //result = 404;
                break;
        }
        return result;
    }
}
