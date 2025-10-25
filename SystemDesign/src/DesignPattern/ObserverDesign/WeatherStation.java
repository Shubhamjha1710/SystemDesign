package DesignPattern.ObserverDesign;

import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements IObservable{
    private int temperature;
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Temperature gets updated, updated temperature:" + this.temperature);
        for (IObserver observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
