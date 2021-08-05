package hwsolution07;

/**
 * web_21M
 * 05 10 : 08
 */
public class ForSeasons {
    public static void main(String[] args) {
        System.out.println(findSeasons(3));
        ;  // Весна
        System.out.println(findSeasons(10));  // осень
        System.out.println(findSeasons(12));  // зима
    }

    public static String findSeasons(int monthNumber) {
        String result = "";
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                result = "зима";
                break;
            case 3:
            case 4:
            case 5:
                result = "весна";
                break;
            case 6:
            case 7:
            case 8:
                result = "лето";
                break;
            case 9:
            case 10:
            case 11:
                result = "осень";
                break;
            default:
                result = "not valid a month number";
                break;
        }
        //result = "Прекрасный сезон для посещения нашей гостиницы " + result;
        return result;
    }
}
