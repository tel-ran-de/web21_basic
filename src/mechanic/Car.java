package mechanic;

import people.Owner;

public class Car {
    public Owner owner;
    public String number;
    public String manufacture;
    public String model;
    public int wheels = 5;
    public boolean isNew = true;


    public Car(Owner owner, String manufacture, String model, String number) {
        this.owner = owner;
        this.manufacture = manufacture;
        this.model = model;
        this.number = number;
    }

    public Car(Owner owner, String manufacture, String model, String number, boolean isNew) {
        this.owner = owner;
        this.manufacture = manufacture;
        this.model = model;
        this.number = number;
        this.isNew = isNew;
    }

    public Car(boolean isNew) {

    }

    public Car(int wheels) {

    }

    public Car(String manufacture) {

    }


    public Car() {

    }

    public String toString() {
        return "mechanic.Car:\n" +
                "\towner: " + this.owner.getFullName() + "\n" +
                "\tmanufacture: " + this.manufacture + "\n" +
                "\tmodel: " + this.model + "\n" +
                "\tnumber: " + this.number + "\n";
    }

}
