package sets;

import java.util.Objects;

public class Person {
    private String name;
    private int workDay;
    private int salaryBase;

    public Person(String name, int workDay, int salaryBase) {
        this.name = name;
        this.workDay = workDay;
        this.salaryBase = salaryBase;
    }

    public int getSalary() {
        return workDay * salaryBase;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return workDay == person.workDay && salaryBase == person.salaryBase && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
