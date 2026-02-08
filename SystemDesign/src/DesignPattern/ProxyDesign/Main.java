package DesignPattern.ProxyDesign;

public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.png");
        img.display(); // here it will create/load new image
        img.display(); // use cached image
    }
}
