package decorator.simple;

public class DekoratorPodstawowyB extends Dekorator {

    private final Skladnik skladnik;

    public DekoratorPodstawowyB(Skladnik skladnik) {
        this.skladnik = skladnik;
    }

    @Override
    public String print() {
        return skladnik.print() + ", " + getClass().getSimpleName();
    }
}
