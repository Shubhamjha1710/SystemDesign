package DesignPattern.CommandDesign;

public class FanCommand implements Command {
    private Fan fan;
    FanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
