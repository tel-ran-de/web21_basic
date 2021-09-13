package animals;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat("Pushistik", 1);
        Dog dog = new Dog("Sharik", 2);

        cat.sayHello();
        dog.sayHello();

        System.out.println(cat);
        Animal cat1 = new Cat("Murzik", 2);
        Animal dog1 = new Dog("Polkan", 5);

        Animal[] animals = new Animal[4];
        animals[0] = cat1;
        animals[1] = dog1;

        animals[2] = (Animal) cat;
        animals[3] = (Animal) dog;

        System.out.println(Arrays.toString(animals));
    }
}
