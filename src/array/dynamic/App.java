package array.dynamic;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayListClass intArray = new ArrayListClass();

        for (int i = 0; i < random.nextInt(5) + 10; i++) {
            intArray.push(random.nextInt(20));
        }

        System.out.println( intArray.getSize() );
        System.out.println( intArray.getCapacity() );

//        intArray.push(10);
//        intArray.push(20);
//
//        System.out.println( intArray.get(1) );
//
//        intArray.pop();
//
//        System.out.println( intArray.get(1) );
//
//        intArray.push(100);
//
//        System.out.println( intArray.get(1) );
//
//        System.out.println( intArray );
//        intArray.push(5, 0);
//        System.out.println( intArray );
//        intArray.push(200, 300);
        System.out.println( intArray );



    }
}
