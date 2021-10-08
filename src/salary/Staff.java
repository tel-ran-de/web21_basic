package salary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Staff {
    private HashMap<Department, HashSet<Employee>> staff;
    private HashSet<Employee> allStaff;

    public Staff() {
        this.staff = new HashMap<>();
        this.allStaff = new HashSet<>();
    }


    public void addEmployee(Employee employee) {

        allStaff.add(employee);

        if ( staff.containsKey(employee.getDepartment()) ) {
            staff.get(employee.getDepartment()).add(employee);
            return;
        }
        HashSet<Employee> newDepartmentStaff = new HashSet<>();
        newDepartmentStaff.add(employee);
        staff.put(employee.getDepartment(), newDepartmentStaff);
    }

    public String getSalaryReport() {

        String output = "";

        for (Map.Entry<Department, HashSet<Employee>> entry : staff.entrySet() ) {

            output += entry.getKey() + "\n" + "============\n";
            for (Employee employee : entry.getValue()) {
                output += employee.getFullName() + "\t\t" + employee.getSalary() + "\n";
            }
            output += "============\n\n";
        }
        return output;
    }
}
