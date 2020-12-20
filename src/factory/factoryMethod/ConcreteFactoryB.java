package factory.factoryMethod;

public class ConcreteFactoryB extends Factory {
    public ConcreteFactoryB() {
    }

    @Override
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}
