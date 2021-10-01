package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class SalaryApp {
    public static void main(String[] args) {
        HashSet<Person> personsState = new HashSet<>();
        ArrayList<Person> population = new ArrayList<>();

        Person p1 = new Person("Ivanov", 24, 200);
        Person p2 = new Person("Petrov", 23, 150);
        Person p3 = new Person("Sidorov", 20, 300);
        Person p5 = new Person("Sidorov", 10, 100);
        Person p4 = new Person("Abramovich", 10, 500);

        population.add(p1);
        population.add(p2);
        population.add(p3);
        population.add(p4);
        population.add(p5);

        personsState.add(p1);
        personsState.add(p2);
        personsState.add(p3);
        personsState.add(p5);



        for (Person p : population) {
            System.out.println(p.hashCode());
            if ( personsState.contains(p) ) {
                System.out.println( p.getName() + ", Получите " + p.getSalary() );
            } else {
                System.out.println(p.getName() + ", Вас не числится");
            }
        }

    }
}
