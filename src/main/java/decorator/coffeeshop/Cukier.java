package decorator.coffeeshop;

public class Cukier extends SkladnikDekorator {

    private final Napoj napoj;

    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 0.99f;
    }

    @Override
    public String pobierzNazwe() {
        return napoj.pobierzNazwe() + ", Cukier";
    }
}
