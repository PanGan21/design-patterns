package strategy.duck;

public class SilentQuacking implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silently quacking");
    }
}
