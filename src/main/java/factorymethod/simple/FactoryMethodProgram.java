package factorymethod.simple;

public class FactoryMethodProgram {

    public static void main(String[] args) {

        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
    }
}
