package command.template;

public class SimpleCommand implements Command {
    private String payload;

    public SimpleCommand(String payload) {
        this.payload = payload;
    }

    @Override
    public void execute() {
        System.out.println("Executing Simple Command using: " + this.payload);
    }
}
