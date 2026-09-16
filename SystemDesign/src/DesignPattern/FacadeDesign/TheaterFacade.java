package DesignPattern.FacadeDesign;

public class TheaterFacade {
    private final DVDPlayer dvdPlayer = new DVDPlayer();
    private final Projector projector = new Projector();
    private final SoundSystem soundSystem = new SoundSystem();

    public void watchMovie(String movie, int volume) {
        System.out.println("Getting ready to watch a movie...");
        dvdPlayer.on();
        projector.on();
        soundSystem.on();

        projector.setInput("DVD");
        dvdPlayer.play(movie);
        soundSystem.setVolume(volume);
        System.out.println("\nEnjoy movie!");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
    }
}
