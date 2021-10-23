package factorymethod.carmanufacture;

public class AmericanCarFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        if ("Audi".equals(type)) {
            return new AmericanAudi();
        } else if ("Volvo".equals(type)) {
            return new AmericanVolvo();
        } else if ("Ferrari".equals(type)) {
            return new AmericanFerrari();
        } else if ("Fso".equals(type)) {
            return new AmericanFso();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
