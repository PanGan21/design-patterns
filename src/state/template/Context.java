package state.template;

public class Context {
    private State state;

    public Context(State state) {
        transition(state);
    }

    public void transition(State state) {
        System.out.println("Transition to: " + state.getClass().getSimpleName());
        this.state = state;
        this.state.setContext(this);
    }

    public void requestA() {
        this.state.handleA();
    }

    public void requestB() {
        this.state.handleB();
    }
}
