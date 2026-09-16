package DesignPattern.BuilderDesign;

// This is builder abstract class or interface which only defines (don't provide its
// implementation) the steps to create the object
//This interface is useful when you have multiple pizza builder with different
//implementation of steps (like Italian Pizza builder, American Pizza etc..)

public interface PizzaBuilder {
    PizzaBuilder setName(String name);
    PizzaBuilder setSize(String size);
    PizzaBuilder setCrust(String crust);
    PizzaBuilder addCheese(boolean value);
    PizzaBuilder addMushrooms(boolean value);
    PizzaBuilder addPepperoni(boolean value);
    PizzaBuilder addOlives(boolean value);
    PizzaBuilder addExtraSauce(boolean value);
    Pizza build();
}