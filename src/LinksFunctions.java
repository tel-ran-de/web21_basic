public class LinksFunctions {
    public static void main(String[] args) {
//        int[] myArray = {1,2,4,3,6,5,8,7,9,10,-5};
//        printArray(myArray);

        int[] myArray2 = new int[10];
        printArray(myArray2);
        fillMyArray(myArray2);
        printArray(myArray2);

        System.out.println( myArray2[5] );

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

    public static void fillMyArray(int[] arrayForFill) {
        for (int i = 0; i < arrayForFill.length; i++) {
            arrayForFill[i] = i*i;
        }
    }
}

// [@lksjlg83

























