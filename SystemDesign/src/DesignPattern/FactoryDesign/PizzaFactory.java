package DesignPattern.FactoryDesign;

public class PizzaFactory {
    public static Pizza createPizza(PizzaType type) {
        switch (type) {
            case PizzaType.Margherita:
                return new MargheritaPizza();
            case PizzaType.Pepperoni:
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Please specify the pizza type");
        }
    }
}
