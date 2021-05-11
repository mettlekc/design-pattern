package cheol.design.state;

public interface PackageState {
    void next(Package currentPackage);
    void prev(Package currentPackage);
    void printStatus();
}
