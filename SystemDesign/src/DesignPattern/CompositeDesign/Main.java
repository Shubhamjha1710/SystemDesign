package DesignPattern.CompositeDesign;

public class Main {
    public static void main(String []args) {

        // client code
        Folder root = new Folder("root");
        root.addElement(new File("file1.txt", 3));
        root.addElement(new File("file2.txt", 4));

        Folder docs = new Folder("docs");
        docs.addElement(new File("resume.pdf", 10));
        docs.addElement(new File("notes.txt", 100));
        root.addElement(docs);

        Folder images = new Folder("images");
        images.addElement(new File("photo.jpg", 1));
        root.addElement(images);


        FileSystemElement img = new File("Image", 1);
        img.open();

        root.getName();
        System.out.println("Folder size: " + root.getSize());
        root.ls();
        root.open();
    }

}
