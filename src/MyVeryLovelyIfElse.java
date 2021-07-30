public class MyVeryLovelyIfElse {
    public static void main(String[] args) {
        //vacationPioneer(true); // то я поеду
       vacationPioneer(false); // то я останусь дома
    }

    public static void vacationPioneer(boolean mamaPermission) {
        if (mamaPermission) {
            System.out.println("То я поеду в пионерский лагерь");
        } else {
            System.out.println("Кто то будет всё лето читать дома Достоевского");
        }
    }
}
