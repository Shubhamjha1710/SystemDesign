package DesignPattern.ObserverDesign;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        IObserver phone1 = new PhoneDisplay("Phone1");
        IObserver phone2 = new PhoneDisplay("Phone2");
        IObserver tv1 = new TVDisplay("TV1");
        IObserver tv2 = new TVDisplay("TV2");


        station.addObserver(phone1);
        station.addObserver(tv1);
        station.setTemperature(25);

        station.addObserver(tv2);
        station.setTemperature(30);

        station.removeObserver(phone1);
        station.setTemperature(50);



    }
}