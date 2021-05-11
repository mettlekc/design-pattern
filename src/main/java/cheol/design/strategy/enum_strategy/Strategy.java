package cheol.design.strategy.enum_strategy;

public enum Strategy {

    STRATEGY_A {
        @Override
        public void execute() {
            System.out.println("Executing strategy A");
        }
    },

    STRATEGY_B {
        @Override
        public void execute() {
            System.out.println("Executing strategy B");
        }
    },
    ;

    public abstract void execute();
}
