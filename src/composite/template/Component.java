package composite.template;

public abstract class Component {
    protected Component parent;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public void add(Component component) { }

    public void remove(Component component) { }

    public boolean isComposite() {
        return false;
    }

    public abstract String operation();
}
