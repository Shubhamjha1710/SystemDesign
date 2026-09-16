package DesignPattern.CommandDesign;

public class TvCommand implements Command{
    private Tv tv;
    TvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
