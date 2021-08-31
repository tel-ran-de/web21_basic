package HomeWork25;

public class Number15 {
    // Задача № 5
    public static void main(String[] args) {
        int minN = 100, maxN = 500;
        int sum = 15;
        int res = findNumSum15(minN, maxN, sum);
        System.out.println("****  Задача № 5 ****");
        System.out.println("Количество натуральных чисел из интервала от " + minN + " до " + maxN + " с суммой цифр 15 равно " + res + ".");
    }

    public static int findNumSum15(int min, int max, int sum) {
        int res = 0;
        for (int i = min; i < max + 1; i++) {
            if (checkSum15(i, sum)) {
                res++;
//                System.out.println("==> " + i);
            }
        }
        return res;
    }

    public static boolean checkSum15(int num, int sum) {
        int n1 = num / 100;
        int n3 = num % 10;
        int n2 = num % 100 / 10;
//        System.out.println(n1 + " " + n2 + " " + n3);
        return n1 + n2 + n3 == sum;
    }
}
