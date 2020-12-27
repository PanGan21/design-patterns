package state.template;

public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handleA();

    public abstract void handleB();
}
