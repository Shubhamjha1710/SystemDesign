package DesignPattern.FactoryDesign.FactoryMethod;


public class BkFactory implements PizzaFactory{
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case PizzaType.BkVegPizza:
                return new BkVegPizza();
            case PizzaType.BkNonVegPizza:
                return new BkNonVegPizza();
            default:
                throw new IllegalArgumentException("Please specify valid the pizza type");
        }
    }
}
