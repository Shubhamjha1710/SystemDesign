package DesignPattern.ChainOfResponsibiltyDesign;

public class ThirdLevelHandler implements Handlers{
    private Handlers nextHandler;
    public void setNextHandler(Handlers handle) {
        this.nextHandler = handle;
    }

    public void handleRequest(int level) {
        if(level == 3) {
            System.out.println("Handler by third level handler");
        } else {
            nextHandler.handleRequest(level);
        }
    }
}
