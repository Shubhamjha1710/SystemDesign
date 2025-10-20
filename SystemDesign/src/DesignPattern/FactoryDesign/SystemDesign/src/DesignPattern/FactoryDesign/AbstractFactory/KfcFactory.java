package DesignPattern.FactoryDesign.AbstractFactory;


public class KfcFactory implements MealFactory{

    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("Pizza")) {
            return new KfcPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type");
        }
    }

    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("Burger")) {
            return new KfcBurger();
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }
    }

}
