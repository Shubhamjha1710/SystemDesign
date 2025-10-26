package DesignPattern.DecoratorDesign;

public class DecoratedCreamCoffee extends CoffeeDecorator{
    DecoratedCreamCoffee(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Cream";
    }

    @Override
    public float getTotalCost() {
        return super.getTotalCost() + 20;
    }
}
