package simplefactory;

public abstract class Car {

    public abstract void getName();

    public void start() {
        System.out.println("start");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }

    public void stop() {
        System.out.println("stop");
    }
}
