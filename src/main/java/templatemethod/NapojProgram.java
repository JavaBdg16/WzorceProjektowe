package templatemethod;

public class NapojProgram {

    public static void main(String[] args) {

        Napoj napoj = new Herbata();
        napoj.recepturaParzenia();

        System.out.println();

        napoj = new Kawa();
        napoj.recepturaParzenia();
    }
}
