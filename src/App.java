import mechanic.Car;
import people.Owner;

public class App {
    public static void main(String[] args) {
        Car ignatyCar = new Car();
        ignatyCar.manufacture = "BMW";
        ignatyCar.model = "525i";
        ignatyCar.number = "B-AB453";
        ignatyCar.owner = new Owner("Ignaty", "Kashnitsky");

        Car dmCar = new Car(new Owner("Dmitry", "Lozovoy"), "Mercedes", "E-class", "M-FD4975");
        System.out.println("=======");
        System.out.println("Dmitry's mechanic.Car");
        System.out.println( dmCar.toString() );
        System.out.println("=======");

//        System.out.println( ignatyCar.wheels );
        System.out.println("=======");
        System.out.println( ignatyCar.toString() );
        System.out.println("=======");

        Car natalyaCar = new Car(new Owner("Natalya", "Morgel"), "Bently", "Super", "D-QE3333", true);
        System.out.println("=======");
        System.out.println( natalyaCar.toString() );
        System.out.println("=======");


        System.out.println( natalyaCar.owner.getFullName() );


    }
}
