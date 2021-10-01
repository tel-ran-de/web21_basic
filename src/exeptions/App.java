package exeptions;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3};
//
//        ArrayList<String> strs = new ArrayList<>();
//        strs.add("Hello, 1");
//        strs.add(0, "Hello, 0");
//        System.out.println(10/0);
//        try {
//            System.out.println( numbers[2] );
//            for (int i = 0; i < strs.size(); i++) {
//                System.out.println( strs.get(i) );
//            }
//            strs.add(10, "Hello, 10");
//            System.out.println( "Cont after error" );
//            System.out.println(10/0);
//        } catch (Exception e) {
//            System.out.println( "Error: " + e.getMessage() );
//        } finally {
//            System.out.println("working always");
//        }
//
//        System.out.println("Hello, World!");

        try {
            System.out.println(getDivision(1, 1));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ups ... " + e.getMessage());
        }


    }
    public static int getDivision(int a, int b) throws Exception {
        if (b == 0) {
            throw new ArithmeticException("Нельзя делить на ноль!!! ");
        }
        if (a == 1) {
            throw new Exception("Зачем?!!!! ");
        }
        return a/b;
    }
}
