package salary;

public class MiddleEmployee extends Employee{

    private double salaryKoef;

    public MiddleEmployee(String fName, String lName, double baseSalary, Department department, double salaryKoef) {
        super(fName, lName, baseSalary, department);
        this.salaryKoef = salaryKoef;
    }

    @Override
    public double getSalary() {
        return baseSalary * salaryKoef;
    }
}
