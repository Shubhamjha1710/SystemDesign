package DesignPattern.ProxyDesign;

public class RealImage implements Image{
    private final String filePath;
    RealImage(String filePath) {
        this.filePath = filePath;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + this.filePath);
    }

    public void display() {
        System.out.println("Displaying image: " + this.filePath);
    }
}
