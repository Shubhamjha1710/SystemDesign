package DesignPattern.FactoryDesign.SimpleFactory;

import DesignPattern.FactoryDesign.SimpleFactory.Pizza;

//Simple factory design pattern when there is only one factory which is creating product
public class Main {
    public static void main(String []args) {
        PizzaType config = PizzaType.Margherita;
        Pizza a = PizzaFactory.createPizza(config);
        Pizza b = PizzaFactory.createPizza(PizzaType.Pepperoni);

        // suppose this main method as client section code
        // now addition of new pizza type here we require creation of new class
        // and addition of new switch case condition in pizza factory class
        // so here addition doesn't require any change at client side

        // and if you don't use factory design we will handle in below way
        // if (config == PizzaType.Pepperoni) {
        //    a = new PepperoniPizza();
        // } else if (config == PizzaType.Margherita) {
        //    a = new MargheritaPizza();
        // } .....
        // addition of new type of pizza require changes in client side code
        a.bake();
        a.prepare();
        a.cut();
        a.box();

        System.out.println("-------------------");
        b.bake();
        b.prepare();
        b.cut();
        b.box();
    }
}
