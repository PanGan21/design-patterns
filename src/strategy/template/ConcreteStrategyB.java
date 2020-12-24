package strategy.template;

import java.util.Arrays;
import java.util.Collections;

public class ConcreteStrategyB implements Strategy {
    @Override
    public String[] executeAlgorithm(String[] data) {
        Arrays.sort(data, Collections.reverseOrder());
        return data;
    }
}
