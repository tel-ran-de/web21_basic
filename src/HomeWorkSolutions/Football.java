package HomeWorkSolutions;

import java.util.Arrays;
import java.util.Random;

public class Football {
    public static void main(String[] args) {
        // Создать две таблицы произвольной, но одинаковой между собой длины.
        //  Первую заполнить названиями футбольных команд, вторую - количеством очков,
        //  полученных в турнире (сгенерировать случайным образом) этими командами.
        //  Определить победителя турнира и вывести на консоль название этой команды.

        Random rand = new Random();
        int count = rand.nextInt(15) + 5;
        String[] teams = new String[count];
        int[] score = new int[count];

        for (int i = 0; i < count; i++) {
            teams[i] = "Team "+ (i+1);
            score[i] = rand.nextInt( count * 3 );
        }

        System.out.println("Турнир закончен. Результаты");
        getFinalResults(teams, score);

        System.out.println( "Победителем турнира является:" );
        getWinners(teams, score);

        System.out.println(Arrays.toString(teams));

    }

    private static void getFinalResults(String[] teams, int[] score) {
        int counter = 1;
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d. %s (%d)\n", counter++, teams[i], score[i]);
        }
    }

    public static void getWinners(String[] teams, int[] score) {
        int maxPoints = getMaxPoints(score);
        int counter = 1;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxPoints) {
                System.out.printf("%d. %s (%d)\n", counter++, teams[i], maxPoints);
            }
        }
    }

    public static int getMaxPoints(int[] score) {
        int result = 0;
        for (int point: score) {
            if (point > result) {
                result = point;
            }
        }
        return result;
    }
}
