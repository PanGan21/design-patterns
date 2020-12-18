package strategy;

public class Client {
    public static void main(String[] args) {
        SilentJetDuck sjd = new SilentJetDuck();
        sjd.display();
        sjd.flyBehavior.fly();
        sjd.quackBehavior.quack();
    }
}
