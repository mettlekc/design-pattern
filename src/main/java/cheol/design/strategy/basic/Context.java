package cheol.design.strategy.basic;

import cheol.design.strategy.basic.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.execute();
    }
}
