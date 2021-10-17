package observer.simple;

public class Main {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("Obs1"));
        subject.attach(new ConcreteObserver("Obs2"));
        subject.attach(new ConcreteObserver("Obs3"));
        subject.attach(new ConcreteObserver("Obs4"));
        subject.attach(new ConcreteObserver1());

        subject.notifyObservers();
    }
}
