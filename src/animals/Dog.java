package animals;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("gav-gav");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name: " + getName() +
                ", age: " + getAge() +
                "}";
    }
}
