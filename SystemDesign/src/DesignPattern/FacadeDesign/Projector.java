package DesignPattern.FacadeDesign;

public class Projector {
    void on() {
        System.out.println("Projector on");
    }
    void setInput(String source) {
        System.out.println("Projector input set to: " + source);
    }
}

