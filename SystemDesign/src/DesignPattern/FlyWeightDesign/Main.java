package DesignPattern.FlyWeightDesign;

public class Main {
    public static void main(String []args) {
        Factory stoneFactory = new Factory();
        // Now here only two flyweight stone is created Blue__2_Granite is gets reused
        StoneContext stone1 = stoneFactory.CreateStone("Blue",2, "Granite", 10);
        StoneContext stone2 = stoneFactory.CreateStone("Blue",2, "Granite", 12);
        StoneContext stone3 = stoneFactory.CreateStone("Black",2, "Granite", 12);

        stone1.RenderStoneContext();
        stone2.RenderStoneContext();
        stone3.RenderStoneContext();

        if(stone1.flyweight.equals(stone2.flyweight)) {
            System.out.println("Stone1 and Stone2 has same flyweight");
        }

        if(stone1.flyweight.equals(stone3.flyweight)) {
            System.out.println("Stone1 and Stone3 has same flyweight");
        }
    }

}
