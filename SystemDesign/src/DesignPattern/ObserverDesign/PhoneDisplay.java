package DesignPattern.ObserverDesign;

public class PhoneDisplay implements IObserver{
    String name;
    PhoneDisplay(String name){
        this.name = name;
    }

    public void update(int temperature) {
        System.out.println(this.name + ": Fetched updated temperature " + temperature + " °C");
    }
}
