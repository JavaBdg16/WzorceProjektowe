package decorator.coffeeshop;

public class KawaBezkofeinowa extends Napoj {

    public KawaBezkofeinowa() {
        nazwa = "Kawa bezkofeinowa";
    }

    @Override
    public float koszt() {
        return 8.99f;
    }
}
