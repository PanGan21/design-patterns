package strategy.template;

public class Example {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStragetyA());
        System.out.println("Client: In Order sorting");
        context.runBusinessLogic();

        // Change sorting strategy
        context.setStrategy(new ConcreteStrategyB());
        System.out.println("Client: Reverse Order sorting");
        context.runBusinessLogic();
    }
}
