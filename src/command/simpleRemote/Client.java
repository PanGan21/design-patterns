package command.simpleRemote;

public class Client {
    public static void main(String[] args) {
        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        // Receiver
        Light light = new Light();

        // Commands
        LightOnCommand lighOn = new LightOnCommand(light);
        LightOffCommand lighOff = new LightOffCommand(light);

        // Invoker invokes a command using the light receiver
        System.out.println("Invoker invokes a command using the light receiver");
        remoteControl.setCommand(lighOn);
        remoteControl.executeButtonPressed();

        // Invoker invokes a command using the light receiver
        System.out.println("\nInvoker invokes a command using the light receiver");
        remoteControl.setCommand(lighOff);
        remoteControl.executeButtonPressed();
    }
}
