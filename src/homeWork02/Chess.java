package homeWork02;

public class Chess {
    public static void main(String[] args) {
        // 1*2 +2*2 +4*2 = 2^64 -1
        // long 2^63
        //
        long a = 1;
        a = a + 2 * a;  // 2
        a = a + 2 * a; // 3
        a = a + 2 * a; // 4

        long c = (long) Math.pow(2, 64);

    }
}
