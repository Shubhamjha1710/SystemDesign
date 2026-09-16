package DesignPattern.BridgeDesign;


public class SUV extends Car{
    public SUV(Engine e) {
        super(e);
    }

    @Override
    public void startCar() {
        engine.start();
        System.out.println("Driving a SUV on the highway.");
    }
}
