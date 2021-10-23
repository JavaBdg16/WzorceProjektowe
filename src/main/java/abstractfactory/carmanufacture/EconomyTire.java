package abstractfactory.carmanufacture;

public class EconomyTire implements Tire {
    @Override
    public void produce() {
        System.out.println("Producing " + getClass().getSimpleName());
    }
}
