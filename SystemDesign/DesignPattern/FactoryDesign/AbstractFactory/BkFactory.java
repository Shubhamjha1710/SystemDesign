package DesignPattern.FactoryDesign.AbstractFactory;


public class BkFactory implements MealFactory{

    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("Pizza")) {
            return new BkPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type");
        }
    }

    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("Burger")) {
            return new BkBurger();
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }
    }

}
