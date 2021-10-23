package decorator.coffeeshop;

public class Espresso extends Napoj {

    public Espresso() {
        nazwa = "Espresso";
    }

    @Override
    public float koszt() {
        return 7.99f;
    }
}
