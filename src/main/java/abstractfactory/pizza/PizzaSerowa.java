package abstractfactory.pizza;

public class PizzaSerowa extends Pizza {

    private final FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy;

    public PizzaSerowa(FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy) {
        this.fabrykaSkladnikowPizzy = fabrykaSkladnikowPizzy;
    }

    @Override
    public void przygotowanie() {
        System.out.println(getNazwa() + " przygotowanie");
        setCiasto(fabrykaSkladnikowPizzy.utworzCiasto());
        setSer(fabrykaSkladnikowPizzy.utworzSer());
        setSos(fabrykaSkladnikowPizzy.utworzSos());
    }
}
