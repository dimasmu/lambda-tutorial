package lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Dimas");
        sayHello(null);
    }

    public static void sayHello(String name) {
//      chain lambda
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        s -> System.out.println("Hello " + s),
                        () -> System.out.println("Hello")
                );

//      pakai full lambda
//        Optional<String> optName = Optional.ofNullable(name);
//        Optional<String> optNameUpper = optName.map(name1 -> name1.toUpperCase());
//        optNameUpper.ifPresent(name12 -> System.out.println("Hello " + name12));

//      manual dengan kondisi
//        if (name != null) {
//            String nameUpper = name.toUpperCase();
//            System.out.println("Hello " + nameUpper);
//        }
    }
}
