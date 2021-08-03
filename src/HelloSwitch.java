public class HelloSwitch {
    // ключевое слово: int, if, else, return, switch
    // конструкция : while, if, switch
    // operator: условный оператор, switch - оператор выбора
            /*
        Пример:

За пятёрку в четверти по математике папа обещал мне велосипед.
За четвёрку в четверти по математике мама купит мне GoPro4.
За тройку меня, наверное, не будут ругать.
За двойку меня отругают.
За единицу мы даже не будем говорить.

         */
    public static void main(String[] args) {
        System.out.println(againTwo(2));
        System.out.println(againTwo(5));
        System.out.println(againTwo(100));
    }

    public static String againTwo(int score) {
        String result = "";
        switch (score) {
            case 1:
                result = "не будем говорить!";
                break;
            case 5:
                result = "велосипед";
                break;  // выход из конструкции -> switch
            case 4:
                result = "GoPro6";
                break;
            case 3:
                result = "ругать не будут";
                break;
            case 2:
                result = "много нотаций";
                break;
            default:
                result= "такой оценки не существует";
                break;
        }
        return result;
    }
    // операторы перехода: break, return, continue.
}
