/**
 * web_21M
 * 05 11 : 15
 */
public class MyLovelyDoWhile {
    public static void main(String[] args) {
        //exampleOne();
        exampleTwo();
    }

    private static void exampleTwo() {
        int secunds = 0;
        // fussschleife
        // постусловие
        do {
            if (secunds % 20 == 0) {
                System.out.println(secunds);
            }
            secunds++;
        } while (secunds < 300);
    }

    private static void exampleOne() {
        // kopfschleife
        // предусловие
        int secunds = 0;  // начало
        // таймер на 300 секунд для варки яиц.
        // секунды прибавляются по одной и
        // каждые 20 секунд СИРИ кричит что прошло 20 секунд
        while (secunds < 300) { // условие
            if (secunds % 20 == 0) {
                System.out.println(secunds);
            }
            // увеличиваем на одну секунду, она успела пройти
            secunds++;  // шаг
        }
    }
}
