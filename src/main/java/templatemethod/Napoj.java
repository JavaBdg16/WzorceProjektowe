package templatemethod;

public abstract class Napoj {

    public void recepturaParzenia() {
        gotowanieWody();
        zaparzenie();
        nalewanieDoFilizanki();
        dodanieSkladnikow();
    }

    protected abstract void dodanieSkladnikow();

    private void nalewanieDoFilizanki() {
        System.out.println("Nalewanie napoji do filiżanki");
    }

    protected abstract void zaparzenie();

    private void gotowanieWody() {
        System.out.println("Gotowanie wody");
    }
}
