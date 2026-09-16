package DesignPattern.BridgeDesign;

public class Main {
    public static void main(String []args){
        Engine petrolEng = new PetrolEngine();
        Engine dieselEng = new DieselEngine();

        Car petrolSedan = new Sedan(petrolEng);
        Car dieselSedan = new SUV(dieselEng);
        Car petrolSUV = new SUV(petrolEng);

        petrolSedan.startCar();
        petrolSUV.startCar();
        dieselSedan.startCar();
    }
}
