package observer.template;

public class ConcreteObserver implements Observer {
    private int value;
    private Subject simpleSubject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.simpleSubject = subject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
