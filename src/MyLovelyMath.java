public class MyLovelyMath {
    public static void main(String[] args) {
        mathRandom();
    }

    public static void mathRandom() {
        int min = 30;
        int max = 100;
        int result = (int) (Math.random() * (max - min) + 1) + min;
        //System.out.println((int) (Math.random() * 100) + 1);
        System.out.println(result);
        //System.out.println((int) (Math.random() * (max - min) + 1) + min);
    }
}
