package salary;

public class SiniorEmployee extends Employee{

    private int longWork;

    public SiniorEmployee(String fName, String lName, double baseSalary, Department department, int longWork) {
        super(fName, lName, baseSalary, department);
        this.longWork = longWork;
    }

    @Override
    public double getSalary() {
        return baseSalary + baseSalary * longWork * .3;
    }
}
