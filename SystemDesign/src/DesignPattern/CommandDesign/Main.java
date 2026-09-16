package DesignPattern.CommandDesign;

public class Main {
    public static void main(String[] args) {
        Light cellingLight = new Light();
        Fan cellingFan = new Fan();
        Tv lcdTv = new Tv();

        RemoteControl remote = new RemoteControl();
        remote.setButtonCommands(0, new LightCommand(cellingLight));
        remote.setButtonCommands(1, new FanCommand(cellingFan));
        remote.setButtonCommands(2, new TvCommand(lcdTv));

        System.out.println("Pressing light button twice");
        remote.pressButton(0);  // on
        remote.pressButton(0);  // off

        System.out.println("Pressing fan button twice");
        remote.pressButton(1);
        remote.pressButton(1);

        // Press unassigned button to show default message
        System.out.println("Pressing tv button twice");
        remote.pressButton(2);
        remote.pressButton(2);

        remote.pressButton(5);

    }
}
