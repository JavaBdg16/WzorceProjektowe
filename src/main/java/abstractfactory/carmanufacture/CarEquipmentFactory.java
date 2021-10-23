package abstractfactory.carmanufacture;

public interface CarEquipmentFactory {

    Engine createEngine();
    Light createLight();
    Tire createTire();
}
