package abstractfactory.carmanufacture;

public class ElectricEngine implements Engine {
    @Override
    public void produce() {
        System.out.println("Producing " + getClass().getSimpleName());
    }
}
