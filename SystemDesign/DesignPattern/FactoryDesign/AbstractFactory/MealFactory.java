package DesignPattern.FactoryDesign.AbstractFactory;

public interface MealFactory {
    Burger createBurger(String type);
    Pizza createPizza(String type);
}
