package lambda.app;

import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {
//      lambda cek panjang karakter
        Function<String, Integer> functionLength = value -> value.length();

        System.out.println(functionLength.apply("Dimas"));


    }

}
