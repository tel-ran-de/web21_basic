public class Exe {
    public static void main(String[] args) {
        System.out.println(helloName("Bob")); //"Hello Bob!"
        System.out.println(helloName("Alice")); // → "Hello Alice!"
        System.out.println(helloName("X")); // → "Hello X!"
        split();
        System.out.println(makeOutWord("<<>>", "Yay")); // → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"
        System.out.println(makeOutWord("[[]]", "London is the capital of the Great Britain"));// → "[[word]]"
        split();
        System.out.println(firstHalf("WooHoo")); //→ "Woo"
        System.out.println(firstHalf("HelloThere")); // → "Hello"
        System.out.println(firstHalf("abcdef")); // → "abc"
        split();
        System.out.println(love6(6, 4)); // → true
        System.out.println(love6(4, 5)); // → false
        System.out.println(love6(1, 5)); // → true
    }

    public static String helloName(String name) {
        String msg = "Hello " + name + "!";
        return msg;
    }

    public static void split() {
        System.out.println("-----------***************----------");
    }


    public static String makeOutWord(String out, String word) {
        //первые 2 символа из out потом word последние 2 символа из out
        return out.substring(0, 2) + word + out.substring(2);
    }

    public static String firstHalf(String word) {
        return word.substring(0, word.length() / 2);
    }

    public static boolean love6(int a, int b) {
        boolean result = false;
        result = (a == 6) || (b == 6) || (a + b == 6) || (Math.abs(a - b) == 6);
        return result;
    }
}
