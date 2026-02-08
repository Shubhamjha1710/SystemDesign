package DesignPattern.ProxyDesign;

/*This proxy image contains the reference of real image*/
public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // lazy loading
        }
        realImage.display();
    }

}
