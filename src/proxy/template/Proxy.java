package proxy.template;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        if (checkAccess()) {
            this.realSubject.request();
        }
    }

    private boolean checkAccess() {
        System.out.println("Proxy is checking access to the Real Subject");
        return true;
    }
}
