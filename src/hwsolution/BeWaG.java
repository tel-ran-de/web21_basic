package hwsolution;

public class BeWaG {
    public static void main(String[] args) {
        System.out.println(findPayMent(48)); // 30€
        System.out.println(findPayMent(500));
        System.out.println(findPayMent(1000));
        System.out.println(findPayMent(101)); //чуть больше 30€
    }

    public static double findPayMent(double kWh) {
        double kWhPrice = .2;
        double abonement = 30.0;
        double kWhInclude = 100;

        if (kWh <= kWhInclude) {
            return abonement;
        } else {
            kWh = kWh - kWhInclude;
            return kWh * kWhPrice + abonement;
        }
    }
}
