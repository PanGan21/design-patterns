package command.template;

public class ComplexCommand implements Command {
    private Receiver receiver;
    private String strA;
    private String strB;

    public ComplexCommand(Receiver receiver, String strA, String strB) {
        this.receiver = receiver;
        this.strA = strA;
        this.strB = strB;
    }

    @Override
    public void execute() {
        System.out.println();
        System.out.println("Executing Complex Command using: ");
        this.receiver.doSomething(this.strA);
        this.receiver.doSomethingElse(this.strB);
    }
}
