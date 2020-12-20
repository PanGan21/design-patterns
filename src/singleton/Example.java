package singleton;

public class Example {
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        System.out.println(sing.getDescription());
    }
}
