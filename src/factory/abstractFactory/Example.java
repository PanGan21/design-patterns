package factory.abstractFactory;

public class Example {
    public static void main(String[] args) {
        ConcreteFactory1 f1 = new ConcreteFactory1();
        ConcreteFactory2 f2 = new ConcreteFactory2();

        System.out.println("Using the Factory 1");
        System.out.println();
        // Create product A 1
        ProductA pA1 = f1.createProductA();
        System.out.println(pA1.operationA());

        // Create product B 1
        ProductB pb1 = f1.createProductB();
        System.out.println(pb1.operationB());
        System.out.println(pb1.secondOperationB());

        System.out.println();
        System.out.println("Using the Factory 2");
        System.out.println();

        // Create product A 2
        ProductA pA2 = f2.createProductA();
        System.out.println(pA2.operationA());

        // Create product B 2
        ProductB pb2 = f2.createProductB();
        System.out.println(pb2.operationB());
        System.out.println(pb2.secondOperationB());
    }

}
