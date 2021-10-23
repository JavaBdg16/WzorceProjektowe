package abstractfactory.pizza;

public class SerReggiano implements Ser {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
