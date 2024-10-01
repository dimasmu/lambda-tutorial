package lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {

    public static void main(String[] args) {

        // imutable LIST
        List<String> list = List.of("Dimas", "Maendra", "Utomo");

        //for loop biasa
        for (var value : list) {
            System.out.println(value);
        }

        //for each dengan anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        //foreach dengan lambda
        list.forEach(value -> System.out.println(value));

        //foreach dengan lambda method reference
        list.forEach(System.out::println);


    }

}
