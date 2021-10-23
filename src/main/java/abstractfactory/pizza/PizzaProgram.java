package abstractfactory.pizza;

public class PizzaProgram {

    public static void main(String[] args) {
        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        wloskaPizzeria.zamowPizza("serowa");

        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();
        amerykanskaPizzeria.zamowPizza("serowa");

        // Pizza - skłąda się z
        //    String nazwa;
        //    Ciasto ciasto;
        //    Sos sos;
        //    Ser ser;

        // zamów pizza:
        // Pizza pizza = utworzPizza(type);
        //
        //        pizza.przygotowanie();
        //        pizza.pieczenie();
        //        pizza.krojenie();
        //        pizza.pakowanie();
    }
}
