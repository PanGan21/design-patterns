package state.template;

public class Example {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.requestA();
        context.requestB();
    }
}
