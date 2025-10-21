package DesignPattern.BuilderDesign;

public class Pizza {
    private String name;
    private String size;
    private String crust;
    private boolean cheese;
    private boolean mushrooms;
    private boolean pepperoni;
    private boolean olives;
    private boolean extraSauce;

    // Private constructor - only builder can access
    Pizza(String name, String size, String crust, boolean cheese, boolean mushrooms,
          boolean pepperoni, boolean olives, boolean extraSauce) {
        this.name = name;
        this.size = size;
        this.crust = crust;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.pepperoni = pepperoni;
        this.olives = olives;
        this.extraSauce = extraSauce;
    }

    public void showPizza() {
        System.out.println(name + " :{" +
                "\n\tSize:" + size + ", \n\tCrust:" + crust
                + ", \n\tCheese:" + cheese + ", \n\tMushrooms:" + mushrooms
                + ", \n\tPepperoni:" + pepperoni + ", \n\tOlives:" + olives
                + ", \n\tExtraSauce:" + extraSauce + "\n}\n");
    }
}