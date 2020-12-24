package strategy.template;

import java.util.Arrays;

public class ConcreteStragetyA implements Strategy {
    @Override
    public String[] executeAlgorithm(String[] data) {
        Arrays.sort(data);
        return data;
    }
}
