package LSP;

public class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
        // turn on Engine
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
