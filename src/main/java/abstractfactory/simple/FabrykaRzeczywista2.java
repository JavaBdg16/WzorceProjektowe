package abstractfactory.simple;

public class FabrykaRzeczywista2 extends FabrykaAbstrakcyjna {

    @Override
    public ProduktAbstrakcyjnyA utworzProduktA() {
        return new ProduktRzeczywistyA2();
    }

    @Override
    public ProduktAbstrakcyjnyB utworzProduktB() {
        return new ProduktRzeczywistyB2();
    }
}
