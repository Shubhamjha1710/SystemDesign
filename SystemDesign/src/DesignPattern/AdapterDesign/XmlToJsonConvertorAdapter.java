package DesignPattern.AdapterDesign;

public class XmlToJsonConvertorAdapter implements IReport{

    // adapter wraping some other  module is currently not compatible with client interaction in terface
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
