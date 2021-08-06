package hwsolution;


public class ExecirsesNonStart {
    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There")); //→ "ellohere"
        System.out.println(nonStart("java", "code")); //→ "avaode"
        System.out.println(nonStart("shotl", "java")); //→ "hotlava"
    }
    public static String nonStart(String str1, String str2) {
        return str1.substring(1) + str2.substring(1);
    }
}
