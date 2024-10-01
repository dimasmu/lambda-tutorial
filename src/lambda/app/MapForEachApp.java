package lambda.app;

import java.util.HashMap;
import java.util.Map;

public class MapForEachApp {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("First name", "Dimas");
        map.put("Middle Name", "Maendra");
        map.put("Last Name", "Utomo");

        //for loop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //foreach lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }

}
