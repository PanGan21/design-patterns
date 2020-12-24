package templatemethod.template;

public class Example {
    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        ConcreteClassB concreteClassB = new ConcreteClassB();

        concreteClassA.templateMethod();
        concreteClassB.templateMethod();
    }
}
