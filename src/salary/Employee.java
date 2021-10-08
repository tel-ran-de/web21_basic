package salary;

public abstract class Employee {
    protected String fName;
    protected String lName;
    protected double baseSalary;
    protected Department department;

    public Employee(String fName, String lName, double baseSalary, Department department) {
        this.fName = fName;
        this.lName = lName;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getFullName() {
        return fName + " " + lName;
    }

    public abstract double getSalary();

}
