package person.scanner;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public int rate;
    public int[] deals;


    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rate = rate;
    }
}