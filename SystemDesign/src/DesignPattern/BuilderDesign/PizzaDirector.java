package DesignPattern.BuilderDesign;

//Director component is optional client directly build it using set and add instructions
//Director control the construction process — i.e., it defines what steps to call and in
//what order to build a particular object (like tandoori non veg, ext cheese brust etc).

//So instead of the client manually doing:
//Pizza pizza = builder
//   .setSize("Large")
//   .setCrust("Thin")
//   .addCheese(true)
//   .addPepperoni(true)
//   .build();

//The Director defines that sequence once and exposes a reusable method:
//Pizza pizza = director.makePepperoniPizza();

public class PizzaDirector {
    private final PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makeVegPizza() {
        return builder
                .setName("VegPizza")
                .setSize("Medium")
                .setCrust("Pan")
                .addCheese(true)
                .addMushrooms(true)
                .addOlives(true)
                .addPepperoni(false)
                .addExtraSauce(true)
                .build();
    }

    public Pizza makeMeatLoversPizza() {
        return builder
                .setName("MeatPizza")
                .setSize("Large")
                .setCrust("Thin")
                .addCheese(true)
                .addMushrooms(false)
                .addOlives(false)
                .addPepperoni(true)
                .addExtraSauce(true)
                .build();
    }

    public Pizza makePepperoniPizza() {
        return builder
                .setName("Pepperoni")
                .setSize("Large")
                .setCrust("Thin")
                .addCheese(true)
                .addPepperoni(true)
                .build();
    }
}
