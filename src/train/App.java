package train;

public class App {
    public static void main(String[] args) {
        WagonType c1 = new WagonType("Вагон 1 класса", 10, 120);
        WagonType c2 = new WagonType("Вагон 2 класса", 50, 70);
        WagonType c3 = new WagonType("Вагон 3 класса", 120, 10);

        Train bD = new Train("1 Берлин - Дрезден", 6);

        bD.wagons[0] = new Wagon("1", c1, 4);
        bD.wagons[1] = new Wagon("2", c2, 27);
        bD.wagons[2] = new Wagon("3", c2, 10);
        bD.wagons[3] = new Wagon("4", c3, 110);
        bD.wagons[4] = new Wagon("5", c3, 96);
        bD.wagons[5] = new Wagon("6", c3, 39);

        System.out.println(bD.getReport());

        Train bP = new Train("2 Берлин - Потсдам", 2);
        bP.wagons[0] = new Wagon("1", c3, 120);
        bP.wagons[1] = new Wagon("2", c3, 100);

        System.out.println(bP.getReport());
//
//        Depo berlinMain = new Depo("Berlin");
//        berlinMain.trains[0] = bD;
//        berlinMain.trains[1] = bP;
//
//        System.out.println( berlinMain.trains[0] );

    }
}
