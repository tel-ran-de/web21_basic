public class Speeding {
    /*
    * You are driving a little too fast, and a police officer stops you.
    *  Write code to compute the result, encoded as an int value:
        0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    * If speed is between 61 and 80 inclusive, the result is 1.
    * If speed is 81 or more, the result is 2.
    * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.*/
    /*
    * Вы едете слишком быстро, и вас останавливает полицейский.
    *  Напишите код для вычисления результата, закодированного в виде значения int:
    0=без штрафа, 1=малый штраф, 2=большой штраф. Если скорость 60 или меньше, результат равен 0.
    *  Если скорость от 61 до 80 включительно, результат равен 1.
    результат - 1. Если скорость 81 или больше, результат - 2.
    * Если только у вас не день рождения - в этот день ваша скорость может быть на 5 выше во всех случаях.
    случаях.
    */
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false)); //→ 0
        System.out.println(caughtSpeeding(65, false)); //→ 1
        System.out.println(caughtSpeeding(65, true)); //→ 0
    }

    private static int caughtSpeeding(int speed, boolean birthday) {

        return 0;
    }
}
