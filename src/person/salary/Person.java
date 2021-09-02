package person.salary;

import java.util.Arrays;
import java.util.Random;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public int rate;
    public int[] deals;


    public Person() {
    }

    public Person(String firstName, String lastName, int age, int rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rate = rate;
        this.generateDeals();
    }

    public void generateDeals() {
        Random random = new Random();
        this.deals = new int[5];
        for (int i = 0; i < this.deals.length; i++) {
            this.deals[i] = random.nextInt(8) + 3;
        }
    }

    public void printSalary() {
        System.out.println("За неделю " + this.getFullName() + " заработал " + this.getSalary() + " денег");
    }

    public String getSalaryString() {
        return "За неделю " + this.getFullName() + " заработал " + this.getSalary() + " денег";
    }

    public int getSalary() {
        return this.getFullDeals() * this.rate ;
    }

    public int getFullDeals() {
        int sum = 0;
        for (int deal : this.deals) {
            sum += deal;
        }
        return sum;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", deals=" + Arrays.toString(deals) +
                '}';
    }
}


// class Object