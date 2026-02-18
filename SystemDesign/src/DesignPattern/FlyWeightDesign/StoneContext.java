package DesignPattern.FlyWeightDesign;

public class StoneContext {
    public int location;
    public StoneFlyweight flyweight;

    StoneContext(StoneFlyweight intrinsic, int loc) {
        flyweight = intrinsic;
        location = loc;
    }

    public void RenderStoneContext() {
        String json = "{\n" +
                    "\tcolour: " + this.flyweight.colour + "\n"+
                    "\tweight: " + this.flyweight.weight + "\n"+
                    "\tmaterial: " + this.flyweight.material + "\n"+
                    "\tlocation: " + this.location + "\n"+
                "}";
        System.out.println(json);
    }
}
