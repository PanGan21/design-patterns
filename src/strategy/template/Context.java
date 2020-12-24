package strategy.template;

public class Context {
    private Strategy strategy;
    private static String[] toBeSorted = {"a", "b", "c", "d", "e"};

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void runBusinessLogic() {
        System.out.println("Context: Sorting the data using the passed algorithm");
        String[] result = this.strategy.executeAlgorithm(toBeSorted);
        System.out.println(String.join(",", result));
    }
}
