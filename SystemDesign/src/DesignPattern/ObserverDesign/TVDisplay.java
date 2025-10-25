package DesignPattern.ObserverDesign;

public class TVDisplay implements IObserver{
    String name;
    TVDisplay(String name) {
        this.name = name;
    }
    public void update(int temperature) {
        System.out.println(this.name + ": Fetched updated temperature " + temperature + " °C");
    }
}
