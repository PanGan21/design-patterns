package strategy.duck;

public class NoFlying implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Not flying");
    }
}
