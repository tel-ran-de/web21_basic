package animals;

public class Bat extends Animal implements CanFly{
    public Bat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Pi-pi-pi");
    }

    @Override
    public void flying() {
        System.out.println("Интенсивно машет крыльями и летит");
    }

    @Override
    public String toString() {
        return "Bat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
