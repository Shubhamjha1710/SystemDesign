package DesignPattern.BuilderDesign;

// Concrete Pizza builder which actually give the implementation of each steps
public class CustomPizzaBuilder implements PizzaBuilder{
    private String name;
    private String size;
    private String crust;
    private boolean cheese;
    private boolean mushrooms;
    private boolean pepperoni;
    private boolean olives;
    private boolean extraSauce;

    @Override
    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder addCheese(boolean value) {
        this.cheese = value;
        return this;
    }

    @Override
    public PizzaBuilder addMushrooms(boolean value) {
        this.mushrooms = value;
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni(boolean value) {
        this.pepperoni = value;
        return this;
    }

    @Override
    public PizzaBuilder addOlives(boolean value) {
        this.olives = value;
        return this;
    }

    @Override
    public PizzaBuilder addExtraSauce(boolean value) {
        this.extraSauce = value;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(name, size, crust, cheese, mushrooms, pepperoni, olives, extraSauce);
    }
}
