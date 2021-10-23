package abstractfactory.carmanufacture;

public class CarEquipmentProgram {
    public static void main(String[] args) {
        createEquipment(new EconomyCarEquipmentFactory());
        System.out.println();
        createEquipment(new PremiumCarEquipmentFactory());
    }

    private static void createEquipment(CarEquipmentFactory factory) {
        Engine engine = factory.createEngine();
        engine.produce();

        Light light = factory.createLight();
        light.produce();

        Tire tire = factory.createTire();
        tire.produce();
    }
}
