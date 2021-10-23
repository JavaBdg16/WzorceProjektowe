package abstractfactory.pizza;

public class SosMarinara implements Sos {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
