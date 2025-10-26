package DesignPattern.CommandDesign;

public class LightCommand implements Command{
    private Light light;
    LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
