import java.util.Arrays;

public class ArrayExamples1 {
    public static void main(String[] args) {
        // Для заданного массива из определенного значения элементов необходимо сделать сориторвку методом
        // пузырьковой сортировки. Результат каждой внешней итерации вывести на консоль
        int[] arrayOut = new int[] {37,28,95,11,52,5,-20};
        System.out.println(Arrays.toString(arrayOut));
        System.out.println("======================");
        bubbleSort(arrayOut);
    }

    public static void bubbleSort(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length -1; i++) {
            for (int j = 0; j < arrayInt.length -1 - i; j++) {
                if ( arrayInt[j] > arrayInt[j+1] ) {
                    int tmp = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = tmp;
                }
            }
            System.out.println(Arrays.toString(arrayInt)); // Вывод результата после каждой внешней итерации
        }
        System.out.println("======================");
        System.out.println(Arrays.toString(arrayInt)); // Вывод конечного резултата
    }

}
