package DesignPattern.CompositeDesign;

public class File implements FileSystemElement {
    String name;
    int size;

    File(String name, int sz) {
        this.name = name;
        this.size = sz;
    }

    @Override
    public void open(){
        System.out.println("Opening file");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize(){
        return size;
    }

    public boolean isFile() {
        return true;
    }
}

