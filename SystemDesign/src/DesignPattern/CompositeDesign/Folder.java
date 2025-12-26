package DesignPattern.CompositeDesign;
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement{
    private String name;
    List<FileSystemElement> children;

    Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    @Override
    public void open(){
        System.out.println("Opening folder");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize(){
        int size = 0;
        for (FileSystemElement element : children) {
            if(!element.isFile()) {
                size += element.getSize();
            } else {
                size += element.getSize();
            }
        }
        return size;
    }

    @Override
    public boolean isFile(){
        return false;
    }

    public void ls() {
        System.out.println("Listing all child in folders");

        for(int i = 0;i<children.size();i++) {
            System.out.println(children.get(i).getName() + "         " + children.get(i).getSize());
        }
    }

    public void openAll(int indent) {
        System.out.println("Opening all subfolders in folders");
    }

    public void addElement(FileSystemElement ele) {
        children.add(ele);
    }

}

