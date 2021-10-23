package abstractfactory.carmanufacture;

public class HalogenLight implements Light {
    @Override
    public void produce() {
        System.out.println("Producing " + getClass().getSimpleName());
    }
}
