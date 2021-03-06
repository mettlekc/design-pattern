package cheol.design.state;

public class OrderedState implements PackageState {
    @Override
    public void next(Package currentPackage) {
        currentPackage.setState(new DeliveredState());
    }

    @Override
    public void prev(Package currentPackage) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet");
    }
}
