package DesignPattern.AdapterDesign;

public class XmlToJsonConvertorAdapter implements IReport{

    // adapter wrapping some other external module. Currently not compatible with client.
    // so creating an adapter which will implements target interface and act as an wrapper
    private final XmlDataProvider xmlFormator = new XmlDataProvider();
    @Override
    public String getJsonData() {
        String xmlData = xmlFormator.getXmlData();
        String jsonData = xmlToJsonConvertor(xmlData);
        return jsonData;
    }

    private String xmlToJsonConvertor(String xmlData) {
        System.out.println("Xml formatted data is:\n" + xmlData);
        String jsonData = "User: {\n\tname: Shubham\n\tid:18016\n}";
        return jsonData;
    }
}
