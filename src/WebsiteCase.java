public class WebsiteCase {
    public static void main(String[] args) {
        int userOneBirthDayYear = 1901;
        findUserAge(1975);
        findUserAge(1981);
        findUserAge(1978);
        findUserAge(2005);
        findUserAge(userOneBirthDayYear);
    }

    public static void findUserAge(int userBirthdayYear) {
        // int userBirthdayYear = 1990;
        int yearNow = 2021;
        int result = yearNow - userBirthdayYear;
        System.out.println("Возраст пользователя " + result);
    }
}
