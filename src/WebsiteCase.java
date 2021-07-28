public class WebsiteCase {
    public static void main(String[] args) {
        // args = arguments

        int userOneBirthDayYear = 1901;
        findUserAge(1975, 2021);
        findUserAge(1981, 2020);
        findUserAge(1978, 2005);
        findUserAge(2005, 2030);
        findUserAge(userOneBirthDayYear, 2021);
    }

    public static void findUserAge(int userBirthdayYear, int yearNow) {
        // int userBirthdayYear = 1990;
        // int yearNow = 2021;
        int result = yearNow - userBirthdayYear;
        System.out.println("Возраст пользователя " + result);
    }

    public static void tryAndCry(){

    }
    public static void example1() {

    }
}
