package DesignPattern.FactoryDesign.SimpleFactory;

public class PepperoniPizza implements Pizza {
    public void prepare() {
        System.out.println("Prepare Pepperoni Pizza");
    }
    public void bake() {
        System.out.println("Baking Pepperoni Pizza");
    }
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza");
    }
    public void box() {
        System.out.println("Boxing Pepperoni Pizza");
    }
}
