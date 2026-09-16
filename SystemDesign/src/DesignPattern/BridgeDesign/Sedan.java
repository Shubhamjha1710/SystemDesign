package DesignPattern.BridgeDesign;

public class Sedan extends Car{
    public Sedan(Engine e) {
        super(e);
    }

    @Override
    public void startCar() {
        engine.start();
        System.out.println("Driving a Sedan on the highway.");
    }
}
