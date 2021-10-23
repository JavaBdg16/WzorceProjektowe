package templatemethod;

public class Herbata extends Napoj {
    @Override
    protected void dodanieSkladnikow() {
        System.out.println("Dodanie cytryny");
    }

    @Override
    protected void zaparzenie() {
        System.out.println("Włożenie torebki herbaty do wrzątku");
    }
}
