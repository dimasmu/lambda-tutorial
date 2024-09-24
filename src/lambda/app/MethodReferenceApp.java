package lambda.app;

import lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {

    public static void main(String[] args) {

//      LAMBDA BIASA
        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);

//      METHOD REFERENCE STATIC
        Predicate<String> predicateIsLowerCaseMethodReference = StringUtil::isLowerCase;


        System.out.println(predicateIsLowerCase.test("Dimas"));
        System.out.println(predicateIsLowerCaseMethodReference.test("dimas"));

//      METHOD REFRENCE DI PARAMETER
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Dimas"));
    }

    public void run(){
        //LAMBDA NON STATIC
        Predicate<String> predicateIsLowerCaseNonStaticLambda = value -> this.isLowerCase(value);

        //METHOD REFERENCE NON STATIC
        Predicate<String> predicateIsLowerCaseNonStaticMethodReference = this::isLowerCase;

        System.out.println(predicateIsLowerCaseNonStaticLambda.test("Dimas"));
        System.out.println(predicateIsLowerCaseNonStaticMethodReference.test("dimas"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

}
