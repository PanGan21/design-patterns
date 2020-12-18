package decorator.template;

public class ConcreteDecorator extends Decorator {
    Component component;

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    public String getDescription() {
        return component.getDescription() + " with a decorator";
    }

    public double cost() {
        return .20 + component.cost();
    }
}
