package simplefactory;

public class SimpleFactory {

    public static Car createCar(String type) {
        if ("Audi".equals(type)) {
            return new Audi();
        } else if ("Volvo".equals(type)) {
            return new Volvo();
        } else if ("Ferrari".equals(type)) {
            return new Ferrari();
        } else if ("Fso".equals(type)) {
            return new Fso();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
