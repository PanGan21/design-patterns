package state.template;

public class ConcreteStateB extends State {
    @Override
    public void handleA() {
        System.out.println("Concrete State B handles request A");
    }

    @Override
    public void handleB() {
        System.out.println("Concrete State B handles request B");
        this.context.transition(new ConcreteStateA());
    }
}
