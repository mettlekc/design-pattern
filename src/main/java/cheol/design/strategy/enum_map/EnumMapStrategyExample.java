package cheol.design.strategy.enum_map;

import cheol.design.strategy.enum_strategy.Strategy;

import java.util.EnumMap;

public class EnumMapStrategyExample {
    static EnumMap<Strategy, Strategy> lookupStrategy= new EnumMap<>(Strategy.class);

    {
        lookupStrategy.put(Strategy.STRATEGY_A, Strategy.STRATEGY_A);
        lookupStrategy.put(Strategy.STRATEGY_B, Strategy.STRATEGY_B);
    }

    public static void main(String[] args) {
        lookupStrategy.get(Strategy.valueOf("STRATEGY_A")).execute();
        lookupStrategy.get(Strategy.valueOf("STRATEGY_B")).execute();
    }
}
