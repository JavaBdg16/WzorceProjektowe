package singleton;

public class SingletonProgram {

    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();

        System.out.println(singleton11 == singleton1);

        Singleton7.INSTANCE.cokolwiek();
    }
}
