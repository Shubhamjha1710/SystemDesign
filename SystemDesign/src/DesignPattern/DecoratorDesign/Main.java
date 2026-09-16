package DesignPattern.DecoratorDesign;

public class Main {
    public static void main(String[] args) {
        ICoffee coffee1 = new CoffeeBase();
        System.out.println(coffee1.getDescription() + " = ₹" + coffee1.getTotalCost());

        coffee1 = new DecoratedCreamCoffee(coffee1);
        System.out.println(coffee1.getDescription() + " = ₹" + coffee1.getTotalCost());

        coffee1 = new DecoratedChocolateCoffee(coffee1);
        System.out.println(coffee1.getDescription() + " = ₹" + coffee1.getTotalCost());

        ICoffee coffee2 = new DecoratedChocolateCoffee(new CoffeeBase());
        System.out.println(coffee2.getDescription() + " = ₹" + coffee2.getTotalCost());

    }
}
