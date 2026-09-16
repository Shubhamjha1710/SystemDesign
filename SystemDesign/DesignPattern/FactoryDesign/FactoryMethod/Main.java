package DesignPattern.FactoryDesign.FactoryMethod;

//Factory Method pattern when there is more than one factory (like KFC , Burger King)
//and each factory is creating its own unique concrete product

public class Main {
    public static void main(String[] args) {
        PizzaFactory kfcFactory = new KfcFactory();
        PizzaFactory bkFactory = new BkFactory();

        Pizza kfcVeg = kfcFactory.createPizza(PizzaType.KfcVegPizza);
        Pizza kfcNonVeg = kfcFactory.createPizza(PizzaType.KfcNonVegPizza);
        Pizza bkVeg = bkFactory.createPizza(PizzaType.BkVegPizza);
        Pizza bkNonVeg = bkFactory.createPizza(PizzaType.BkNonVegPizza);

        kfcVeg.prepare();
        kfcNonVeg.prepare();
        bkVeg.prepare();
        bkNonVeg.prepare();
    }

}
