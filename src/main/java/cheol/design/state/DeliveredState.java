package cheol.design.state;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package currentPackage) {
        currentPackage.setState(new ReceivedState());
    }

    @Override
    public void prev(Package currentPackage) {
        currentPackage.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
