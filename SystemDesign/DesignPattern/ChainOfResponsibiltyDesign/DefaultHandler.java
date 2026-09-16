package DesignPattern.ChainOfResponsibiltyDesign;

public class DefaultHandler implements Handlers{

    public void setNextHandler(Handlers handle) {}

    public void handleRequest(int level) {
        System.out.println("Handler by default level handler");
    }
}
