public class MyBooleanExample {
    public static void main(String[] args) {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        boolean b = (7 + 8) * 4 != 7 + 4 * 5;
        boolean c = 3 + 4 > 9 + 1 && 16 - 5 > 3 * 4;
        boolean d = 16 / 2 < 6 + 2 || 4 + 5 <= 4 * 5;
        boolean e = !(3 * 4 < 7 + 8);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
