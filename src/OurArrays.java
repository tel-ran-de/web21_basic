import java.util.Arrays;
import java.util.Locale;

public class OurArrays {
    public static void main(String[] args) {
        int[] array = new int[10]; // Создали массив состоящий из 10 элементов
        int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        boolean[] isTrue = {true, false, false, true};
        String[] stringArray = {"Hello", "my", "name", "is", "Java"};
        double[] arrayTo = {3.14}; // arrayTo[0]

        // По умолчанию все массивы инициализируются:
        // числовые - 0
        // boolean - false
        // Object - null

        // Чтобы посмотреть содержимое массива array, необходимо привести его в строковый вид командой
        // Arrays.toString(array)

        System.out.println( Arrays.toString(arr1) );
        System.out.println( Arrays.toString(isTrue) );

        // array.length - показывает нам количество элементов в массиве
        System.out.println( arr2.length );

        // Чтобы обратиться к элементу массива по его индексу используем следующий код - array[index]
        System.out.println(arr1[4]);

        // Индексация массива начинается ВСЕГДА СТРОГО С 0
        // [1,2,3,4,5] - элементы массива
        //  0,1,2,3,4  - индексы элементов массива

        System.out.println( arr1[arr1.length-1] ); // Обращение к последнему элементу массива

        // length - 10
        // last index - 9


        // При необходимости обращаться к элементам массива через их индекс, используем цикл For с параметром
        for (int index = 0; index < arr1.length ; index++) {
            arr1[index] = index*10;
        }

        System.out.println( Arrays.toString(arr1) );

        // При отсутствии необходимости использовать индекс элемента и в случае, когда нужно обработать значения всех
        // элементов массива используем цикл For each
        for (String element: stringArray) {
            if (element == "name") {
                element = element.toUpperCase(Locale.ROOT);
            }
            System.out.print(element + " ");
        }

    }
}
