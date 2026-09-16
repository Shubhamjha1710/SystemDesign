package DesignPattern.CompositeDesign;

public interface FileSystemElement {
    void open();
    int getSize();
    String getName();
    boolean isFile();
}
