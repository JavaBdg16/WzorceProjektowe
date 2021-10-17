package observer.simple;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("update " + getClass().getSimpleName());
    }
}
