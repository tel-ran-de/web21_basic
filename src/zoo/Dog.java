package zoo;

public class Dog extends Animal{

    protected String owner;


    public Dog(int height, int weight, String color, int age, String name, String breed, String owner) {
        super(height, weight, color, age, name, breed);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String sayHello() {
        return "gav-gav";
    }

    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                "}";
    }
}
