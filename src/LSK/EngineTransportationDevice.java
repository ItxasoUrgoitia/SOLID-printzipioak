package LSK;

public abstract class EngineTransportationDevice extends TransportationDevice {
    Engine engine;

    public void startEngine() {
        if (engine != null) {
            engine.start();
        } else {
            System.out.println("No engine found!");
        }
    }

    @Override
    public void start() {
        startEngine();
    }
}
