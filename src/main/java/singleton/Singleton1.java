package singleton;

public class Singleton1 {

    // EAGER

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
