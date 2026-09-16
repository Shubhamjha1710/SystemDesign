package DesignPattern.DecoratorDesign;

public class CoffeeDecorator implements ICoffee {
    private ICoffee decoratedCoffee;

    CoffeeDecorator(ICoffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public float getTotalCost() {
        return decoratedCoffee.getTotalCost();
    }
}
