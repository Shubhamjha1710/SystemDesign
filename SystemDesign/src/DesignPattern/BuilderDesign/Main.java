package DesignPattern.BuilderDesign;

// In this example Pizza will act as product
public class Main {
    public static void main(String[] args) {

        //client can make pizza like this, by setting fields they want to add by himself
        PizzaBuilder builder1 = new CustomPizzaBuilder();
        Pizza a = builder1
                .setName("ClientMade")
                .setSize("Regular")
                .setCrust("Pan")
                .addCheese(true)
                .addMushrooms(true)
                .addOlives(false)
                .addPepperoni(true)
                .addExtraSauce(false)
                .build();
        a.showPizza();

        //can uses reusable method to create pizzas
        PizzaBuilder builder2 = new CustomPizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder2);
        Pizza b = director.makeMeatLoversPizza();
        Pizza c = director.makeVegPizza();
        Pizza d = director.makePepperoniPizza();

        b.showPizza();
        c.showPizza();
        d.showPizza();
    }
}
