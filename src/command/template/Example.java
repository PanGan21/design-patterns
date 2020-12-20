package command.template;

public class Example {
    public static void main(String[] args) {
        // Create the receiver
        Receiver receiver = new Receiver();

        // Create the commands
        SimpleCommand simpleCommand = new SimpleCommand("A simple command");
        ComplexCommand complexCommand = new ComplexCommand(receiver, "A first complex command", "A second complex command");

        // Create the invoker
        Invoker invoker = new Invoker(simpleCommand, complexCommand);

        // Invoker executes the commands
        invoker.start();
        invoker.finish();
    }
}
