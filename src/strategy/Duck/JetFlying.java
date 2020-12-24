package strategy.duck;

public class JetFlying implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with a Jet");
    }
}
