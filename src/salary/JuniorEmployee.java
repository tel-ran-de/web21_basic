package salary;

public class JuniorEmployee extends Employee{

    public JuniorEmployee(String fName, String lName, double baseSalary, Department department) {
        super(fName, lName, baseSalary, department);
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}
