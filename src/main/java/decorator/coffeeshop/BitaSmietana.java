package decorator.coffeeshop;

public class BitaSmietana extends SkladnikDekorator {

    private final Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 2.99f;
    }

    @Override
    public String pobierzNazwe() {
        return napoj.pobierzNazwe() + ", Bita śmietana";
    }
}
