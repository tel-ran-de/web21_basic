package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "Ivanov", "0001");
        Student st2 = new Student("Ivan", "Petrov", "0002");
        Student st3 = new Student("Oleg", "Zhukov", "0003");
        Student st4 = new Student("Marya", "Kudestnica", "0004");
        Student st5 = new Student("Marpha", "Vasilyeva", "0005");

        Teacher t1 = new Teacher("Nikodim", "Neludov");

        LearningDay today = new LearningDay(t1);

        ArrayList<Student> graphic = new ArrayList<>();
        graphic.add(st1);
        graphic.add(st3);
        graphic.add(st4);
        graphic.add(st5);

        HashMap<LearningDay, ArrayList<Student>> pos = new HashMap<>();
        pos.put(today, graphic);

        ArrayList<Student> graphic1 = new ArrayList<>();
        graphic1.add(st1);
        graphic1.add(st2);
        graphic1.add(st4);
        graphic1.add(st5);

        LearningDay ysd = new LearningDay(t1);
        ysd.setDate( today.getDate().minusDays(1) );
        pos.put(ysd, graphic1);


        for (Map.Entry<LearningDay, ArrayList<Student>> entry: pos.entrySet()) {
            System.out.println( entry.getKey() + ": " + entry.getValue());
        }


    }
}
