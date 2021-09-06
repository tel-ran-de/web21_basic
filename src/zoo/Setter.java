package zoo;

public class Setter extends Dog{

    public String className = this.getClass().getName();
    private String target;


    public Setter(int height, int weight, String color, int age, String name, String breed, String owner, String target) {
        super(height, weight, color, age, name, breed, owner);
        this.target = target;
    }

    @Override
    public String getOwner() {
        return "Setter's owner: " + this.owner;
    }

    @Override
    public String toString() {
        return "Setter{" +
                "height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", " + this.getOwner() +
                ", class='" + this.className + '\'' +
                ", target='" + this.target + '\'' +
                '}';
    }
}
