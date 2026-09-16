package DesignPattern.FactoryDesign.FactoryMethod;

public class KfcFactory implements PizzaFactory{
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case PizzaType.KfcVegPizza:
                return new KfcVegPizza();
            case PizzaType.KfcNonVegPizza:
                return new KfcNonVegPizza();
            default:
                throw new IllegalArgumentException("Please specify valid the pizza type");
        }
    }
}
