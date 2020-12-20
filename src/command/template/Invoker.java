package command.template;

public class Invoker {
    private Command onStart;
    private Command onFinish;

    public Invoker(Command onStart, Command onFinish) {
        this.onStart = onStart;
        this.onFinish = onFinish;
    }

    public void start() {
        onStart.execute();
    }

    public void finish() {
        onFinish.execute();
    }
}
