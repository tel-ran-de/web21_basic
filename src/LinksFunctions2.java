public class LinksFunctions2 {
    public static void main(String[] args) {


        int[] myArray2 = {2,6,3,8,4,0,2,1,67};
//        int[] anyNewArray = {2,5,7,0};
        printArray(myArray2);
        int[] myArray3 = someChanges(myArray2);
//        int[] myArray4 = someChanges(myArray3);
//        int[] myArray6 = someChanges(anyNewArray);
//        int[] myArray5 = myArray3;
        System.out.println("!=!=!=!=!");
        printArray(myArray2);
        printArray(myArray3);
//        printArray(myArray4);

//        System.out.println(myArray3);
//        System.out.println(myArray4);
//        System.out.println(myArray5);
//
//        System.out.println( myArray3[7] );
//        System.out.println( myArray4[7] );
//        System.out.println( myArray5[7] );
//
//        System.out.println("---");
//        myArray3[7] = 2;
//        System.out.println( myArray3[7] );
//        System.out.println( myArray4[7] );
//        System.out.println( myArray5[7] );

    }

    public static int[] someChanges(int[] array) {
        int[] resultArray = new int[array.length];
        for(int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array[i] * array[i];
        }
        return resultArray;
    }

    public static void printArray(int[] arrayForPrint) {
        System.out.println("==============");
        for (int i = 0; i < arrayForPrint.length; i++) {
            System.out.printf("Element with index=%d is %d\n", i, arrayForPrint[i]);
        }
        System.out.println("==============");
        System.out.println("Total elements " + arrayForPrint.length);
        System.out.println("==============");
    }

}

// [@lksjlg83

























