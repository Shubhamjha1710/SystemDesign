package DesignPattern.BridgeDesign;

abstract class Car {
    public Engine engine;
    public Car(Engine e) {
        this.engine = e;
    }

    public abstract void startCar();
}
