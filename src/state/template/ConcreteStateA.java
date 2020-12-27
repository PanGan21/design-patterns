package state.template;

public class ConcreteStateA extends State {
    @Override
    public void handleA() {
        System.out.println("Concrete State A handles request A");
        this.context.transition(new ConcreteStateB());
    }

    @Override
    public void handleB() {
        System.out.println("Concrete State A handles request B");
    }
}
