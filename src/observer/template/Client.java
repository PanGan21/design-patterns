package observer.template;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);

        subject.registerObserver(observer);
        observer.update(50);
        subject.setValue(100);
        subject.removeObserver(observer);
    }





}
