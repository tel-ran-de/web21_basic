package people;

public class App {
    public static void main(String[] args) {
        System.out.println( Man.howMany() );
        Man adam = new Man("Adam");
        Man eva = new Man("Eva");

        System.out.println(Man.howMany());

    }
}
