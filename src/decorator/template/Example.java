package decorator.template;

public class Example {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratedComponent = new ConcreteDecorator(component);

        System.out.println(decoratedComponent.getDescription());
    }
}
