package abstractfactory.carmanufacture;

public class MatrixLight implements Light {
    @Override
    public void produce() {
        System.out.println("Producing " + getClass().getSimpleName());
    }
}
