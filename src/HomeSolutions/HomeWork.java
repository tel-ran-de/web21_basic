package HomeSolutions;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
        getTrain();
        getCheckmateBoard();
        getSport();
    }

    public static void getSport() {
        // ** В двумерном массиве хранится информация о баллах, полученных спортсменами-пятиборцами в каждом из пяти
        // видов спорта (в первой строке — информация о баллах первого спортсмена, во второй — второго и т. д.).
        // Общее число спортсменов равно 20. Создать результирующую таблицу и по ней определить победителя.

        int [][] scoreBoard = new int[5][5];
        for (int i = 0; i < scoreBoard.length; i++) {
            for (int j = 0; j < scoreBoard[i].length; j++) {
                scoreBoard[i][j] = getRandomNumber(5, 10);
            }
        }

        System.out.println("======");
        for (int[] element: scoreBoard) {
            System.out.println(Arrays.toString(element));
        }
        System.out.println("======");

        getChampionsShipTable(scoreBoard);


    }

    public static void getChampionsShipTable(int[][] scoreBoard) {
        int[] resultTable = new int[ scoreBoard.length ];
        for (int i = 0; i < scoreBoard.length; i++) {
            int finishResult = 0;
            for (int j = 0; j < scoreBoard[i].length; j++) {
                finishResult += scoreBoard[i][j];
            }
            resultTable[i] = finishResult;
        }
        System.out.println("=======");
        System.out.println(Arrays.toString(resultTable));
        System.out.println("=======");
        int max = 0;
        for (int cell: resultTable) {
            if ( cell > max ) {
                max = cell;
            }
        }

        int count = 0;
        String winners = ""; // Можно самостоятельно изучить тип данных StringBuilder
        for (int i = 0; i < resultTable.length; i++) {
            if ( resultTable[i] == max ) {
                winners += count > 0 ? ", " + (i+1) : (i+1);
                count++;
            }
        }

        System.out.printf("The winners are number %s\n", winners);

    }

    public static void getCheckmateBoard() {
        // Заполнить двумерный массив размером n * n единицами и двойками таким образом, чтобы единицы размещались так,
        // как размещаются на шахматной доске черные поля, а двойки — как белые поля. Начинается построение с черной клетки

        int boardSize = getRandomNumber(4,8);
        int[][] board = new int[boardSize][boardSize];
//        boolean start = true;
        for (int i = 0; i < board.length; i++) { // start = true; i = 0
            for (int j = 0; j < board[i].length; j++) {
//                if (start) {
//                    board[i][j] = 1;
//                } else {
//                    board[i][j] = 2;
//                }
//                start = !start;

//                if ( i % 2 == 0 && j % 2 == 0 || i %2 != 0 && j % 2 != 0 ) {
//                    board[i][j] = 1;
//                } else {
//                    board[i][j] = 2;
//                }

//                board[i][j] = ( i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0 ) ? 1 : 2;

                board[i][j] = ( (i+j) % 2 == 0 ) ? 1 : 2;

            }
        }

        System.out.println("======");
        for (int[] element: board) {
            System.out.println(Arrays.toString(element));
        }

    }

    public static void getTrain() {

        // В поезде 18 вагонов, в каждом из которых 36 мест. Информация о проданных на поезд билетах хранится
        // в двумерном массиве, номера строк которых соответствуют номерам вагонов, а номера столбцов — номерам мест.
        // Если билет на то или иное место продан, то соответствующий элемент массива имеет значение 1,
        // в противном случае — 0. Составить программу, определяющую число свободных мест в любом из вагонов поезда.
        int[][] train = new int[18][36];
        for (int i = 0; i < train.length; i++) {
            for (int j = 0; j < train[i].length; j++) {
                train[i][j] = getRandomNumber(0,1);
            }
        }

        int wagon = getRandomNumber(0,18);

        getFreePlace(train[wagon]);



    }

    public static void getFreePlace(int[] places) {
        System.out.println(Arrays.toString(places));
        int sum = 0;
        for (int i = 0; i < places.length; i++) {
            sum += places[i];
        }
        System.out.println( "В вагоне " + (places.length - sum) + " свободных мест" );
    }

    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
}
