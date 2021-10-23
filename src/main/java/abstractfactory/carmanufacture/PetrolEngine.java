package abstractfactory.carmanufacture;

public class PetrolEngine implements Engine {
    @Override
    public void produce() {
        System.out.println("Producing " + getClass().getSimpleName());
    }
}
