package factory.factoryMethod;

public class Example {
    public static void main(String[] args) {
        // Create as many productA from this factory
        Factory factoryProductA= new ConcreteFactoryA();
        factoryProductA.someOperation();
        Product productA = factoryProductA.factoryMethod();
        System.out.println(productA.operation());

        // Create as many productB from this factory
        Factory factoryProductB = new ConcreteFactoryB();
        factoryProductB.someOperation();
        Product productB = factoryProductB.factoryMethod();
        System.out.println(productB.operation());
    }
}
