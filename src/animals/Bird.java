package animals;

public class Bird extends Animal implements CanFly, HaveFeather{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Chirik-chik-chik");
    }

    @Override
    public void flying() {
        System.out.println("Спокойно машет крыльями и летит");
    }

    @Override
    public void feather() {
        System.out.println("Имеет разноцветное оперение");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
