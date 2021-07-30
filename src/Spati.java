public class Spati {
    public static void ageCheck(int birthdayYear) {
        int age = 2021 - birthdayYear;  // magicNumber
        if (age >= 18) {
            System.out.println("Водку и сигареты можно");
        } else if (age >= 16) {
            System.out.println("Можно продавать пиво");
        } else {
            System.out.println("Ничего из взрослого продавать нельзя");
        }
    }

    public static void main(String[] args) {
        ageCheck(2000); // можно
        ageCheck(2005); // можно , не всё
        ageCheck(2015); // нельзя

    }
}
