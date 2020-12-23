package proxy.template;

public class Example {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxySubject = new Proxy(realSubject);

        // Call the method of real subject with the proxy
        proxySubject.request();
    }
}
