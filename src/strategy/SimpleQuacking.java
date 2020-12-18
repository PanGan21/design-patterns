package strategy;

public class SimpleQuacking implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Simple quacking");
    }
}
