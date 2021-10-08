package salary;

public class App {
    public static void main(String[] args) {
        Department developers = new Department("Developer Department");
        Department designers = new Department("Designer Department");

        Staff qa21 = new Staff();

        qa21.addEmployee( new JuniorEmployee("Ivan", "Ivanov", 1500, developers) );
        qa21.addEmployee( new JuniorEmployee("Petr", "Smirnov", 1500, developers) );
        qa21.addEmployee( new JuniorEmployee("Ivan", "Ivanov", 1500, designers) );

        qa21.addEmployee( new MiddleEmployee("Pavel", "Sinitsin", 2000 ,developers, 1.3) );
        qa21.addEmployee( new MiddleEmployee("Sofia", "Pirogova", 2000 ,developers, 1.35) );
        qa21.addEmployee( new MiddleEmployee("Anna", "Dudova", 1800 ,designers, 1.3) );
        qa21.addEmployee( new MiddleEmployee("Olga", "Lastichkina", 2000 ,developers, 1.3) );
        qa21.addEmployee( new MiddleEmployee("Katja", "Kurochkina", 2000 ,designers, 1.3) );

        qa21.addEmployee( new SiniorEmployee( "Natalia", "Morgel", 3000, developers, 3 ) );
        qa21.addEmployee( new SiniorEmployee( "Andrei", "Chernov", 2500, designers, 4 ) );

        System.out.println(qa21.getSalaryReport());

    }
}
