package abstractfactory.pizza;

public class AmerykanskaPizzeria extends Pizzeria {
    @Override
    protected Pizza utworzPizza(String type) {
        Pizza pizza = null;

        FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy
                = new AmerykanskaFabrykaSkladnikowPizzy();

        if ("serowa".equals(type)) {
            pizza = new PizzaSerowa(fabrykaSkladnikowPizzy);
            pizza.setNazwa("Amerykańska pizza serowa");
        }

        return pizza;
    }
}
