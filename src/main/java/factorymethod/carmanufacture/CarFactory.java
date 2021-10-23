package factorymethod.carmanufacture;

public abstract class CarFactory {

    public void manufactureCar(String type) {
        Car car = createCar(type);

        car.start();
        car.accelerate();
        car.stop();
    }

    public abstract Car createCar(String type);
}
