public class HelloString {
    public static void main(String[] args) {
        //exampleOne();
        //helloString();
        helloString2();
    }

    public static void helloString2() {
        String title = "London is the capital of Great Britain";
        int size = title.length();
        System.out.println(size);
        String endOfTitleSymbols = "...";
        System.out.println(title.substring(0, 25) + endOfTitleSymbols);
        System.out.println(title.toUpperCase());
        System.out.println(title.substring(0, 25).toUpperCase() + endOfTitleSymbols);
        System.out.println(title.toLowerCase());
    }

    public static void helloString() {
        boolean d1 = false;
        String userFirstname = "Andrej";
        String secondName = "Podlubnyj";
        char copyright = '\u00A9';
        String copyright2 = "\u00A9";
        int age = 18;
        System.out.println(
                userFirstname + copyright + secondName + copyright2 + age
        );
    }

    public static void exampleOne() {
        // char, (Character), symbol
        char c1 = '&';
        char c2 = '™';
        char c3 = '\t';
        char c4 = '\n';
        char c5 = 100;
        char c6 = '\u039A';
        System.out.println(c5);
        System.out.println(c6);
        char c7 = '\u00A9';
        System.out.println(c7);
        char c8 = 169;
        System.out.println(c8);
        System.out.println(c2 + 0);
    }
}
