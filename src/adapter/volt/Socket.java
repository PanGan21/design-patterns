package adapter.volt;

// Adaptee
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
