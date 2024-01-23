package LSP;

// this is not following LSP since the subclass is trying to narrow down the scope of SuperClass
// and hence subclass cant be passed to a superclass reference
// i.e. Bike bike = new Bicycle() will break the code since Bicycle does not have Engine
public class Bicycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no Engine");
    }

    @Override
    public void accelerate() {
        // do something
    }
}
