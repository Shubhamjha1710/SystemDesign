package DesignPattern.FacadeDesign;

//Without facade design client must have to handle all subsystem initializations
public class Main {
    public static void main(String[] args) {
        TheaterFacade theater = new TheaterFacade();
        theater.watchMovie("Demon Slayer", 10);
        theater.endMovie();
    }
}
