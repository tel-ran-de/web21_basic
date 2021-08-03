package hwsolution6;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(findLeapYear(1980));
        System.out.println(findLeapYear(2020));
        System.out.println(findLeapYear(2000));
        System.out.println(findLeapYear(1900));  // false
        System.out.println(findLeapYear(1981));  // false
        System.out.println(findLeapYear(2021));  // false
    }

    public static boolean findLeapYearVeriSimple(int year) {
        return year % 4 == 0;
    }

    public static boolean findLeapYear(int year) {
        // boolean суперЦондион = year > 400;
        boolean condition400 = (year % 400 == 0);  // 2000 -> труе
        boolean condition4 = year % 4 == 0;
        boolean condition100 = year % 100 == 0;
        return condition400 || (condition4 ^ condition100);
        //return (year % 400 == 0) || (year % 4 == 0 ^ year % 100 == 0);
    }

    public static boolean findLeapYearSimple(int year) {
        // 1. Если модуло 400 == 0
        // 2. Если год делится на 100 год - невисокосный
        // 3. Если год делится на 4 , то он вискосный
        if (year % 400 == 0) {  // здесь отсекаются все года которые делятся на 400 ->> 4000, 2000
            return true;
        } else if (year % 100 == 0) { // здесь отсекаются все года которые делятся на 100
            return false;
        } else if (year % 4 == 0) {  // модуло 4 ==0
            return true;
        } else {
            return false;
        }
    }
}
