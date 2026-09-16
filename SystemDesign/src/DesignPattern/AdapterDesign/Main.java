package DesignPattern.AdapterDesign;

public class Main {
    public static void main(String[] args) {
        // client will only create object of adapter and gets its data in json fromat
        IReport adapter = new XmlToJsonConvertorAdapter();
        String data = adapter.getJsonData();
        System.out.println("Json formatted data:\n"+data);
    }
}
