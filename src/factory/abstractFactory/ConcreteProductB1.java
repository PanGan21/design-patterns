package factory.abstractFactory;

public class ConcreteProductB1 implements ProductB {
    @Override
    public String operationB() {
        return "Product B 1 Operation";
    }

    @Override
    public String secondOperationB() {
        return "Product B 1 Second Operation";
    }
}
