package templatemethod.template;

public class ConcreteClassB extends AbstractClass {
    @Override
    protected void requiredOperation() {
        System.out.println("Concrete Implementation B of require Operation");
    }

    @Override
    protected void hook() {
        System.out.println("Concrete Implementation B of hook");
    }
}
