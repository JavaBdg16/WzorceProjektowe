package abstractfactory.pizza;

public class WloskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy {
    @Override
    public Ciasto utworzCiasto() {
        return new CienkieChrupkieCiasto();
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
