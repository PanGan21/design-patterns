package decorator.template;

public abstract class Component {
    String description = "Unknown Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
