package factory.factoryMethod;

public abstract class Factory {
    abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        System.out.println("Creator: The same creator's code has just worked with" + product.operation());
    }
}
