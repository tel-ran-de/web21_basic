public class HomeTask {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false));
        System.out.println(smartDepositBox(false, true));
        System.out.println(smartDepositBox(false, false));
    }

    public static boolean smartDepositBox(boolean mamaPermission, boolean papaPermission) {
        return mamaPermission || papaPermission;
    }
}
