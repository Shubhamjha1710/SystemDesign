package DesignPattern.ChainOfResponsibiltyDesign;

public interface Handlers {
    public void setNextHandler(Handlers h);
    public void handleRequest(int level);
}
