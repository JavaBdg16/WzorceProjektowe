package simplefactory;

public class CarManufacture {

//    private final SimpleFactory simpleFactory;
//
//    public CarManufacture(SimpleFactory simpleFactory) {
//        this.simpleFactory = simpleFactory;
//    }

    public void manufactureCar(String type) {
        Car car = SimpleFactory.createCar(type);

        car.getName();
        car.start();
        car.accelerate();
        car.stop();
    }
}
