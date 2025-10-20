package DesignPattern.FactoryDesign.AbstractFactory;

//Abstract factory Method pattern when there is more than one factory
//and each factory is creating its families of products like both burger king and kfc
//is preparing both pizza and burger (for simplicity using only one type of pizza and
//burger)

public class Main {
    public static void main(String []args) {
        MealFactory kfcFactory = new KfcFactory();
        MealFactory bkFactory = new BkFactory();

        Pizza kfcPizza = kfcFactory.createPizza("Pizza");
        Burger kfcBurger = kfcFactory.createBurger("Burger");

        Pizza bkPizza = bkFactory.createPizza("Pizza");
        Burger bkBurger = bkFactory.createBurger("Burger");

        kfcPizza.prepare();
        kfcBurger.prepare();
        bkPizza.prepare();
        bkBurger.prepare();
    }
}
