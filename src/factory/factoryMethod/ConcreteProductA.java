package factory.factoryMethod;

public class ConcreteProductA implements Product{
    public ConcreteProductA() {
    }

    @Override
    public String operation() {
        return "Product A Operation";
    }
}
