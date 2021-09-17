package people;

import java.util.ArrayList;

public class Man {
    static int count = 0;
    String name;
    final ArrayList<Man> children = new ArrayList<>();

    public Man(String name) {
        this.name = name;
        count++;
    }

    static String howMany() {
        return count == 0 ? "Вначале было Слово" : count+ " Адамов и Ев в нашем королевстве";
    }

    public void newChild(Man man) {
        children.add(man);
    }

    public void resetChildren() {
//        children = new ArrayList<>(); // Незя!!!
    }

}
