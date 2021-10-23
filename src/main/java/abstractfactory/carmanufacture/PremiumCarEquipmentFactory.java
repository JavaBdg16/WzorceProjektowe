package abstractfactory.carmanufacture;

public class PremiumCarEquipmentFactory implements CarEquipmentFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Light createLight() {
        return new MatrixLight();
    }

    @Override
    public Tire createTire() {
        return new PremiumTire();
    }
}
