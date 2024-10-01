package lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScoreWithLazyParameter(20, LazyApp::getName);
    }

    // Lazy parameter dipanggil hanya ketika dipakai (ketika masuk if score > 80 dan memanggil name.get)
    public static void testScoreWithLazyParameter(int score, Supplier<String> name) {

        if (score > 80) {
            System.out.println("Selamat " + name.get() + " anda lulus");
        } else {
            System.out.println("Coba tahun depan");
        }

    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Dimas";
    }
}
