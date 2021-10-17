package adapter;

public class IndykAdapter implements Kaczka {

    private final Indyk indyk;

    public IndykAdapter(Indyk indyk) {
        this.indyk = indyk;
    }

    @Override
    public void kwacz() {
        indyk.gulgocz();
    }

    @Override
    public void lataj() {
        indyk.lataj();
    }
}
