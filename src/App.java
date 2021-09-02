import person.salary.Person;

import java.util.Arrays;

public class App {
    // Создать объект класса Person у которого будет Имя, Фамилия,
    // Возраст, ставка за продажу, массив продаж за неделю (5 дней)
    // Вывести на экран его заработок (сделать это через метод класса)



    public static void main(String[] args) {
//        Person p1 = new Person("Ivan", "Ivanov", 37, 25);
//        System.out.println( p1 );
//        System.out.println("==========");
//        p1.printSalary();
//        System.out.println( p1.getSalaryString() );

        // int[] array = new int[] {1,2,3,4,5};

        Person[] persons = new Person[]{
                new Person("Ivan", "Ivanov", 37, 25),
                new Person("Ivan", "Petrov", 39, 30),
                new Person("Ivan", "Sidorov", 27, 15),
                new Person("Ivan", "Nikolaev", 45, 40)
        };

//        System.out.println(Arrays.toString(persons));
        int total = 0;
        for (Person person : persons) {
            person.printSalary();
            System.out.println( person.getFullName() + "  всего сделок " + person.getFullDeals() );
            total += person.getSalary();
        }
        System.out.println("==========");
        System.out.println("команда всего заработала " + total + " денег. Сочувствуем собственникам ;-(");

    }
}
