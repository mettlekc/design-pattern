package cheol.design.strategy.basic;

public class StrategyApplication {

    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new StrategyA());
        context.execute();

        context.setStrategy(new StrategyB());
        context.execute();
    }
}
