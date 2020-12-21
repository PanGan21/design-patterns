package facade.template;

public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade(Subsystem1 subsystem1, Subsystem2 subsystem2) {
        this.subsystem1 = subsystem1;
        this.subsystem2 = subsystem2;
    }

    public String operation() {
        String result = "Facade uses the systems:\n";
        result += this.subsystem1.operation1();
        result += this.subsystem2.operation1();
        result += "\nFacade orders subsystems to perform the action:\n";
        result += this.subsystem1.operationN();
        result += this.subsystem2.operationZ();
        return result;
    }
}
