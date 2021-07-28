public class IntToDouble {
    public static void main(String[] args) {
        //exampleOne();
        exampleTwo();
    }

    public static void exampleTwo() {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;
        System.out.println("int var3 = " + var3);

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        System.out.println("double var 6 = " + var6);
        double var7 = (var1 / var2);
        System.out.println("var7 = " + var7);
        double var8 = var1 / var4;
        System.out.println("var8 = " + var8);
        double var9 = var1 / var5;
        System.out.println("var9 = " + var9);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2);
    }

    public static void exampleOne() {
        // double 64 bit
        int a = 8;
        double b = a;
        System.out.println(b);
        double c = 5.5;
        int d = (int) c;
        System.out.println(d);
    }
}
