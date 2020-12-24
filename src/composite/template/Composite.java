package composite.template;

import java.util.ArrayList;

public class Composite extends Component {
    protected ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        this.children.add(component);
        component.setParent(this);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
        component.setParent(null);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public String operation() {
        ArrayList<String> results = new ArrayList<String>();
        for (Component child : children) {
            results.add(child.operation());
        }
        return "Node(" + String.join("+", results) + ")";
    }
}
