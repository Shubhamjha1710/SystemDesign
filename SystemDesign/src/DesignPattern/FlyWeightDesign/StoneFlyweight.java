package DesignPattern.FlyWeightDesign;

//Contains intrinsic states
public class StoneFlyweight {
    public String colour;
    public int weight;
    public String material;

    public StoneFlyweight(String color, int wt, String mat) {
        this.colour = color;
        this.weight = wt;
        this.material = mat;
    }
}
