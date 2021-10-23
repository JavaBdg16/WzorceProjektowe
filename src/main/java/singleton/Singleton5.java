package singleton;

public class Singleton5 {

    private static Singleton5 instance;
    private static Object lock = new Object();

    private Singleton5() {
    }

    public static Singleton5 getInstance() {

        synchronized (lock) {
            if (instance == null) {

                synchronized (lock) {
                    instance = new Singleton5();
                }
            }
        }

        return instance;
    }
}
