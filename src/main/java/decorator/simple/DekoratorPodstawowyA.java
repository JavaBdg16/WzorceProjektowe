package decorator.simple;

public class DekoratorPodstawowyA extends Dekorator {

    private final Skladnik skladnik;

    public DekoratorPodstawowyA(Skladnik skladnik) {
        this.skladnik = skladnik;
    }

    @Override
    public String print() {
        return skladnik.print() + ", " + getClass().getSimpleName();
    }
}
