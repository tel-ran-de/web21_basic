package zoo;

public class Animal {
    protected int height;
    protected int weight;
    protected String color;
    protected int age;
    protected String name;
    protected String breed;

    public Animal(int height, int weight, String color, int age, String name, String breed ) {
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public String sayHello() {
        return "u-u-u-u";
    }

    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
