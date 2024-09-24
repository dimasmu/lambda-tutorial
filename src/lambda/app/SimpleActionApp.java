package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//      lambda adalah representasi sederhana dari anonymus class
//      Versi anonymus class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return name;
            }
        };

        System.out.println(simpleAction1.action("Dimas"));

//      Versi lambda class (lambda adalah versi sederhana dari anonymus class)

        SimpleAction simpleAction2 = (String name) -> {
            return name;
        };

        System.out.println(simpleAction2.action("Dimas"));


//      versi lebih simple
        SimpleAction simpleAction3 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction4 = (value) -> {
            return "Hello " + value;
        };

        System.out.println(simpleAction3.action("Dimas"));
        System.out.println(simpleAction4.action("Dimas"));

//      lambda tanpa blok
        SimpleAction simpleAction5 = (String value) -> "Hello "+ value;

        SimpleAction simpleAction6 = (value) -> "Hello "+ value;

        SimpleAction simpleAction7 = value -> "Hello "+ value;

        System.out.println(simpleAction5.action("Dimas"));
        System.out.println(simpleAction6.action("Dimas"));
        System.out.println(simpleAction7.action("Dimas"));
    }
}
