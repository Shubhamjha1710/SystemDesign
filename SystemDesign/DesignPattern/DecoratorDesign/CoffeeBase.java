package DesignPattern.DecoratorDesign;

public class CoffeeBase implements ICoffee{
    @Override
    public String getDescription() {
        return "Base Coffee";
    }

    @Override
    public float getTotalCost() {
        return 20.00f;
    }
}
