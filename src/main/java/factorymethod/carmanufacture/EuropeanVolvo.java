package factorymethod.carmanufacture;

public class EuropeanVolvo extends Car {
    @Override
    public void start() {
        System.out.println(getClass().getSimpleName() + " start");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " accelerate");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " stop");
    }
}
