package factory.factoryMethod;

public class ConcreteFactoryA extends Factory {
    public ConcreteFactoryA() {
    }

    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}
