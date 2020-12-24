package templatemethod.template;

public abstract class AbstractClass {
    public void templateMethod() {
        this.baseOperation();
        this.requiredOperation();
        this.hook();
    }

    protected void baseOperation() {
        System.out.println("Abstract class base operation");
    }

    protected abstract void requiredOperation();

    protected void hook() { };
}
