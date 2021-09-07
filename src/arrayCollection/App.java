package arrayCollection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// ArrayList - Это класс, который представляет собой динамический массив для объектов заданного типа

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", 29);
        Person p10 = new Person("Petr", "Petrov", 39);
        Person p2 = new Person("Marya", "Ivanova", 18);
        Person p3 = new Person("Marya", "Smirnova", 18);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

//        System.out.println( persons );
//        System.out.println("==========");
//        System.out.println( persons.size() );
//        System.out.println("==========");
//        System.out.println( persons.get(0) );
//        System.out.println("==========");
//        System.out.println( persons.get(1) );

        persons.set(1, p3);

//        System.out.println( persons.get(1) ); // array[1]
//        System.out.println("==========");
        persons.add(p2);
//        System.out.println( persons );
//        System.out.println("==========");

//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
//
//        System.out.println("==========");
//
//        for (Person person : persons) {
//            System.out.println(person);
//        }
//
//        System.out.println("==========");

        persons.add(1, new Person("A","B",5));

//        System.out.println( persons );
//        System.out.println("==========");
//
//
//        persons.remove(1);
//        System.out.println( persons );
//
//        System.out.println("==========");
//
//        persons.clear();
//        System.out.println( persons );
//
//
//
//
        ArrayList<String> words = new ArrayList<>(); // int, double, boolean, ...

        String word = "Hello world";
        words.add(word);

        System.out.println( persons );

        System.out.println(persons.contains(p1));
        System.out.println(persons.contains(p10));

        System.out.println(persons.indexOf(p3));
        System.out.println(persons.indexOf(p10));

        if ( persons.indexOf(p10) == -1 ) {
            System.out.println("Элемент не найден");
        }

        for (Person person: persons) {
            if ( person.getFirstName().equals("Marya") ) {
                System.out.println(person);
            }
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(-10);
        numbers.add(10);
        numbers.add(94);
        numbers.add(36);
        numbers.add(-1000);

        Collections.sort(numbers);
        System.out.println( numbers );

        int[] num1 = {2,3,1,-10,10,94,36,-1000};
        Arrays.sort(num1);
        System.out.println( Arrays.toString(num1) );


    }
}
