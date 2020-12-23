package proxy.template;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Subject is handling the request");
    }
}
