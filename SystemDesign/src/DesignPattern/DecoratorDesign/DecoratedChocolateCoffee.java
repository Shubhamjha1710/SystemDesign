package DesignPattern.DecoratorDesign;

public class DecoratedChocolateCoffee extends CoffeeDecorator{
    DecoratedChocolateCoffee(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Chocolate";
    }


    @Override
    public float getTotalCost() {
        return super.getTotalCost() + 30;
    }
}
