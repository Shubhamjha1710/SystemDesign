package DesignPattern.CommandDesign;

//Will act as a receiver devicess
public class Fan {
    public void on()  {
        System.out.println("Fan is ON");
    }
    public void off() {
        System.out.println("Fan is OFF");
    }
}
