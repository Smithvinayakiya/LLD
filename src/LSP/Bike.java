package LSP;

/*
    LSP: Superclass should be replacable by Subclass
        i.e. Subclass should not narrow down the parent functionality
    There the Bicycle class will break the functionality. see comments there
*/
public interface Bike {
    void turnOnEngine();
    void accelerate();
}
