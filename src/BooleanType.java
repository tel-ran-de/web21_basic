public class BooleanType {
    public static void main(String[] args) {
        System.out.println( true && true ); // true
        System.out.println( false || true ); // true
        System.out.println( true || true ); // true
        System.out.println( true || false ); // true

        System.out.println( false && true ); // false
        System.out.println( true && false ); // false
        System.out.println( false && false ); // false
        System.out.println( false || false ); // false

        int a = 1;

        System.out.println( a > 0 || a > 2 && a < 10 );

        System.out.println( 1 > 0 );
        System.out.println( 0 < 1 );
        System.out.println( 0 == 0 );
        System.out.println( 1 != 0 );
    }
}
