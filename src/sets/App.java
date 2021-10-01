package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        System.out.println( strings.size() );
        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        System.out.println( strings.size() );
        System.out.println( strings );

        System.out.println(strings.remove("!"));
        System.out.println( strings.size() );
        System.out.println( strings );

        System.out.println(strings.contains("Hello World"));

        System.out.println(strings.isEmpty());

        printSet(strings);
        System.out.println("=============");
        System.out.println(strings.add("Hello"));
        printSet(strings);
        System.out.println("=============");
//        strings.clear();
//        System.out.println(strings.isEmpty());

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);

        System.out.println( list.contains(3) );

        System.out.println(list);

    }

    public static void printSet(HashSet<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }
}
