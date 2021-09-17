package auto;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Car("B0"+i+"4DF", "Mercedes E-class"));
        }

        Car car = new Car("B0164DF", "Audi TT");

        Owner ivan = new Owner();
        ivan.name = "Ivan";
        ivan.setAge(10);
        ivan.passport = 12345;
        System.out.println(ivan.getAge());

        System.out.println( Owner.getStr() );
        ivan.happyBirthday();
        System.out.println(ivan.getAge());
        System.out.println(Owner.getStr());

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i).equals(car) ) {
                System.out.println("Yes");
                System.out.println(car);
                System.out.println(list.get(i));
                break;
            }
        }

    }
}
