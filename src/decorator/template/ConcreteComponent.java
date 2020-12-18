package decorator.template;

public class ConcreteComponent extends Component {
    public ConcreteComponent() {
        description = "I am a concrete component";
    }

    public double cost() {
        return 1.99;
    }
}
