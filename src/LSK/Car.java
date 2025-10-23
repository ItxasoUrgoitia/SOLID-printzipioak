package LSK;

public class Car extends EngineTransportationDevice {

    public Car() {
        this.engine = new Engine();
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starting...");
        super.startEngine();
    }
}
