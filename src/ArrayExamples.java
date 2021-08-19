public class ArrayExamples {
    public static void main(String[] args) {
        printResultOfStringToCharArray();
    }

    public static void printResultOfStringToCharArray() {
        // Каким образом можно превратить строку в массив символов из которых эта строка состоит?
        String str = "Hello";
        char[] ch = getCharArrayFromString(str);
        System.out.println(ch[0]);
    }

    public static char[] getCharArrayFromString(String str) {
        return str.toCharArray();
    }
}
