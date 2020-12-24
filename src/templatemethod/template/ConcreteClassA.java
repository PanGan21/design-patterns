package templatemethod.template;

public class ConcreteClassA extends AbstractClass {
    @Override
    protected void requiredOperation() {
        System.out.println("Concrete Implementation A of require Operation");
    }
}
