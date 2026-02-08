package DesignPattern.ChainOfResponsibiltyDesign;

public class Main {
    public static void main(String [] args) {
        FirstLevelHandler firstLevel = new FirstLevelHandler();
        SecondLevelHandler secondLevel = new SecondLevelHandler();
        ThirdLevelHandler thirdLevel = new ThirdLevelHandler();
        DefaultHandler defaultHandler = new DefaultHandler();

        firstLevel.setNextHandler(secondLevel);
        secondLevel.setNextHandler(thirdLevel);
        thirdLevel.setNextHandler(defaultHandler);

        firstLevel.handleRequest(1);
        firstLevel.handleRequest(2);
        firstLevel.handleRequest(3);
        firstLevel.handleRequest(-1);

    }
}
