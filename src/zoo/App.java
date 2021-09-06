package zoo;

public class App {
    public static void main(String[] args) {

        Cat pushok = new Cat( 40, 4500, "black", 36, "Pushok", "Siamise" );
        Dog sharik = new Dog(90, 12000, "Red-Orange", 48, "Sharik", "Setter", "Natalia");
        Dog druzhok = new Setter(90, 12000, "Red-Orange", 48, "Druzhok", "Setter", "Ignaty", "birds");

        System.out.println( pushok );
        System.out.println( sharik );
        System.out.println( druzhok );

        System.out.println( pushok.sayHello() );
        System.out.println( sharik.sayHello() );
        System.out.println( druzhok.sayHello() );

//        System.out.println( pushok.getClass() );
//        System.out.println( pushok.getClass().getName() );
//        System.out.println( pushok.getClass().getSimpleName() );

    }
}
