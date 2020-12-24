package strategy.duck;

public class SilentJetDuck extends Duck {
    public SilentJetDuck() {
        quackBehavior = new SilentQuacking();
        flyBehavior = new JetFlying();
    }

    @Override
    void display() {
        System.out.println("I am a silent jet duck");
    }


}
