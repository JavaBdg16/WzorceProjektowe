package decorator.coffeeshop;

public class Mleko extends SkladnikDekorator {

    private final Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 1.99f;
    }

    @Override
    public String pobierzNazwe() {
        return napoj.pobierzNazwe() + ", Mleko";
    }
}
