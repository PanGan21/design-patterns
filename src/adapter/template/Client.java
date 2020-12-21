package adapter.template;

public class Client {
    public static void main(String[] args) {
        IAdapter target = new Adapter(new Adaptee());
        target.request();
    }
}
