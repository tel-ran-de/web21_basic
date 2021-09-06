package zoo;

public class Cat extends Animal {


    public Cat(int height, int weight, String color, int age, String name, String breed) {
        super(height, weight, color, age, name, breed);
    }


    public String sayHello() {
        return "mau-mau";
    }
}
