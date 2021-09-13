package animals;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("miau-miau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name: " + getName() +
                ", age: " + getAge() +
                "}";
    }
}
