package templatemethod;

public class Kawa extends Napoj {
    @Override
    protected void dodanieSkladnikow() {
        System.out.println("Dodanie cuktru i mleka");
    }

    @Override
    protected void zaparzenie() {
        System.out.println("Zaparzenie i przesączenie przez filtr");
    }
}
