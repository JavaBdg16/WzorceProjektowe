package decorator.coffeeshop;

public abstract class Napoj {

    protected String nazwa = "";

    public String pobierzNazwe() {
        return nazwa;
    }

    public abstract float koszt();
}
