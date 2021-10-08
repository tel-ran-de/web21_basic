package maps;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        /*
        Integer -> key
        String -> value

        Methods
        put(key, value)
        get(key)
        remove(key)
        containsKey(key)
        containsValue(value)
        size()
         */

        HashMap<String, String> phones = new HashMap<>();
        phones.put("Ivanov", "911-0985647");
        phones.put("Petrov", "911-0985363");
        phones.put("Petrov", "911-0985365");
        phones.put("Sidorov", "911-0365647");
        phones.put("Mamaykin", "911-7462647");
        System.out.println(phones);
        for (Map.Entry<String, String> entry: phones.entrySet()) {
            System.out.println( entry.getKey() + ": " + entry.getValue());
        }

        System.out.println( phones.entrySet() );

        System.out.println( phones.get("Ivanov") );
        System.out.println( phones.get("Ivanova") );

        phones.remove("Mamaykin");
        System.out.println( phones );

        System.out.println( phones.containsKey("Mamaykin") );
        System.out.println( phones.containsKey("Ivanov") );

        System.out.println( phones.containsValue("911-0365647") );

        System.out.println( phones.size() );

        for (Map.Entry<String, String> entry: phones.entrySet()) {
            if ( entry.getValue().equals("911-0365647") ) {
                System.out.println( entry.getKey() );
                break;
            }
        }

    }
}
