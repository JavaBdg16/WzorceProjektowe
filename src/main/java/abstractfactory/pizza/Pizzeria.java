package abstractfactory.pizza;

public abstract class Pizzeria {

    public Pizza zamowPizza(String type) {
        Pizza pizza = utworzPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }

    protected abstract Pizza utworzPizza(String type);
}
