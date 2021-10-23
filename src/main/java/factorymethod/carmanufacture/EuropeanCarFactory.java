package factorymethod.carmanufacture;

import simplefactory.Audi;
import simplefactory.Ferrari;
import simplefactory.Fso;
import simplefactory.Volvo;

public class EuropeanCarFactory extends CarFactory {

    @Override
    public Car createCar(String type) {
        if ("Audi".equals(type)) {
            return new EuropeanAudi();
        } else if ("Volvo".equals(type)) {
            return new EuropeanVolvo();
        } else if ("Ferrari".equals(type)) {
            return new EuropeanFerrari();
        } else if ("Fso".equals(type)) {
            return new EuropeanFso();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
