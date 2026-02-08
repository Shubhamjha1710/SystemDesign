package DesignPattern.ChainOfResponsibiltyDesign;

public class FirstLevelHandler implements Handlers{

    private Handlers nextHandler;
    public void setNextHandler(Handlers handle) {
        this.nextHandler = handle;
    }

    public void handleRequest(int level) {
        if(level == 1) {
            System.out.println("Handler by first level handler");
        } else {
            nextHandler.handleRequest(level);
        }
    }
}
