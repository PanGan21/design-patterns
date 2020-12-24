package bridge.template;

public class ExtendedAbstraction extends Abstraction {
    private Implementation implementation;

    public ExtendedAbstraction(Implementation implementation) {
        super(implementation);
        this.implementation = implementation;
    }

    @Override
    public String operation() {
        String result = this.implementation.operationImplementation();
        return "ExtendedAbstraction: Extended operation with: " + result;
    }
}
