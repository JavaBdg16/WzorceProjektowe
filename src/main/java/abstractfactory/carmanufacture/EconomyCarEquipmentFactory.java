package abstractfactory.carmanufacture;

public class EconomyCarEquipmentFactory implements CarEquipmentFactory {
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Light createLight() {
        return new HalogenLight();
    }

    @Override
    public Tire createTire() {
        return new EconomyTire();
    }
}
