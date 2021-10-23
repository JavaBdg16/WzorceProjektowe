package abstractfactory.carmanufacture;

public class PremiumTire implements Tire {
    @Override
    public void produce() {
        System.out.println("Producing " + getClass().getSimpleName());
    }
}
