package abstractfactory.pizza;

public class WloskaPizzeria extends Pizzeria {

    @Override
    protected Pizza utworzPizza(String type) {
        Pizza pizza = null;

        FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy
                = new WloskaFabrykaSkladnikowPizzy();

        if ("serowa".equals(type)) {
            pizza = new PizzaSerowa(fabrykaSkladnikowPizzy);
            pizza.setNazwa("Włoska pizza serowa");
        }

        return pizza;
    }
}
