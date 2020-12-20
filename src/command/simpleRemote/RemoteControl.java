package command.simpleRemote;

public class RemoteControl {
    Command command;

    public RemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeButtonPressed() {
        command.execute();
    }
}
