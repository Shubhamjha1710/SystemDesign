package DesignPattern.AdapterDesign;

//return data in xml format
public class XmlDataProvider {
    String getXmlData() {
        String data = "<user> \n \t<name>Shubham</name> \n \t<id>18016</id>\n</user>";
        return data;
    }
}
