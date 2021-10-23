package abstractfactory.simple;

public class FabrykaRzeczywista1 extends FabrykaAbstrakcyjna {

    @Override
    public ProduktAbstrakcyjnyA utworzProduktA() {
        return new ProduktRzeczywistyA1();
    }

    @Override
    public ProduktAbstrakcyjnyB utworzProduktB() {
        return new ProduktRzeczywistyB1();
    }
}
