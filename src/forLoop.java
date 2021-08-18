import java.util.Arrays;

public class forLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            //System.out.println( i );
//        }
//
//        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < array.length; i++) {
//            //System.out.println( array[i] );
//        }
//
//
//        int i =0;
//        for (int element: array) {
//            System.out.println( element );
//            System.out.println("Current index is " + i );
//            i++;
//        }
//
//        for (int j = 1; j < 10; j++) {
//            for (int k = 1; k < 10; k++) {
//                System.out.print(j*k+"\t");
//            }
//            System.out.println();
//        }

//        printLine();
//        printReverseLine();
//        printBothLines();
//        printWatch();
//        printTable();
        printSuperArray();
//        generateTable();
    }

    public static void printLine() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10; j++) {
                if (i==j) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static void printReverseLine() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10; j++) {
                if (i == 10 - j) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static void printBothLines() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10; j++) {
                if (i == j || i == 10-j) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static void printWatch() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10; j++) {
                if ((j >= i && j <= 10-i) || (10-j <= i && 10-j >= 10-i)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static void printTable () {
        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(j*k+"\t");
            }
            System.out.println();
        }
    }

    public static void printSuperArray() {
//        int [] array = new int[] {1,2,3,4,5,6,7,8,9};
//        for (int x : array) {
//            System.out.println( x );
//        }
//
//        for (int x : array) {
//            System.out.print( x );
//        }

        // t -> [[1,2,3], [4,5,6], [7,8,9]]
        // [1,2,3]
        // [4,5,6]
        // [7,8,9]

        // t[1][2]

        int [][] arr = new int [3][3];
        int [][] arr1 = new int [][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] arr2 = new int [][] {{1}, {2,3,4}, {3,2}, {9,8,7,6,5}};

//        System.out.println( arr2[0][1] ); // Error - нет такого индекса во внутреннем массиве

//        System.out.println(arr1[1][2]);

//        System.out.println(Arrays.deepToString(arr1));

    }

    public static void generateTable() {
        int [][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i+1)*(j+1);
            }
        }

        for (int[] element: arr) {
            System.out.println(Arrays.toString(element));
        }


    }


}
