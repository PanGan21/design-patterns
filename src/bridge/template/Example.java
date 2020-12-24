package bridge.template;

public class Example {
    public static void main(String[] args) {
        ConcreteImplementationA implementationA = new ConcreteImplementationA();
        Abstraction abstraction = new Abstraction(implementationA);
        System.out.println(abstraction.operation());

        ConcreteImplementationB concreteImplementationB = new ConcreteImplementationB();
        ExtendedAbstraction extendedAbstraction = new ExtendedAbstraction(concreteImplementationB);
        System.out.println(extendedAbstraction.operation());
    }
}
