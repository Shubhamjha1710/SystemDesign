package DesignPattern.ChainOfResponsibiltyDesign;

public class SecondLevelHandler implements Handlers{
    private Handlers nextHandler;
    public void setNextHandler(Handlers handle) {
        this.nextHandler = handle;
    }

    public void handleRequest(int level) {
        if(level == 2) {
            System.out.println("Handler by second level handler");
        } else {
            nextHandler.handleRequest(level);
        }
    }
}
