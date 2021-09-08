package linkedlist;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);
        stringList.add(str4);

        System.out.println( stringList );

        System.out.println(stringList.get(2));

        stringList.remove(2);
        System.out.println( stringList );

        stringList.addFirst(str3);
        System.out.println( stringList );
        stringList.addLast(str3);
        System.out.println( stringList );

        System.out.println(stringList.getFirst());
        System.out.println(stringList.getLast());

        stringList.removeFirst();
        stringList.removeLast();

        System.out.println( stringList );

        stringList.add(2, str3);
        System.out.println( stringList );
    }
}
