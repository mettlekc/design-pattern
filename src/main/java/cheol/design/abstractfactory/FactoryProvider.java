package cheol.design.abstractfactory;

public class FactoryProvider {

    // https://www.baeldung.com/java-abstract-factory-pattern

    public static AbstractFactory getFactory(String choice) {
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnymalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
