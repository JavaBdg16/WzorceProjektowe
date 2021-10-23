package abstractfactory.pizza;

public class AmerykanskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy {

    @Override
    public Ciasto utworzCiasto() {
        return new CiastoPan();
    }

    @Override
    public Sos utworzSos() {
        return new SosMarinara();
    }

    @Override
    public Ser utworzSer() {
        return new SerReggiano();
    }
}
