public class ExercisesBoolean01 {
    public static void main(String[] args) {
        // литералы
        System.out.println(smartDepositBox(true, false)); //  -> true
        System.out.println(smartDepositBox(false, true)); //-> true
        System.out.println(smartDepositBox(false, false)); //-> false
        split();
        System.out.println(smartDepositBoxVersionTwo(true, false)); // ->false
        System.out.println(smartDepositBoxVersionTwo(false, true)); //->false
        System.out.println(smartDepositBoxVersionTwo(false, false));// ->false
        System.out.println(smartDepositBoxVersionTwo(true, true)); //->true
        split();
        System.out.println(
                verySmartDepositBoxVersionThree(true, true, true)); //true
        System.out.println(
                verySmartDepositBoxVersionThree(true, true, false)); //true
        System.out.println(
                verySmartDepositBoxVersionThree(false, false, false)); //false
        System.out.println(
                verySmartDepositBoxVersionThree(false, false, true)); //true
    }

    public static boolean verySmartDepositBoxVersionThree(boolean mamaPermission,
                                                          boolean papaPermission,
                                                          boolean omaPermission) {
        //return (mamaPermission && papaPermission )|| omaPermission;
        return smartDepositBoxVersionTwo(mamaPermission, papaPermission) || omaPermission;
    }

    public static boolean smartDepositBoxVersionTwo(boolean mamaPermission, boolean papaPermission) {
        return mamaPermission && papaPermission;
    }

    public static boolean smartDepositBox(boolean mamaPermission, boolean papaPermission) {
        return mamaPermission || papaPermission;
    }


    public static void split() {
        System.out.println("------------***********************------------");
    }
    public static boolean doorbell(boolean bell1, boolean bell2) {
        return bell1 ^ bell2;
    }



    public static boolean bigBadaBoom(boolean b1, boolean b2) {
        boolean result = b1 && b2;
        return result;
    }
}
