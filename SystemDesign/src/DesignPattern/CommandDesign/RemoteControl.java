package DesignPattern.CommandDesign;

// Will acts as an invoker component
public class RemoteControl {
    private static final int numOfButtons = 9;
    private Command []buttonCommands = new Command[numOfButtons];
    private boolean []buttonPressed = new boolean[numOfButtons];

    // we can use builder design pattern here to create a remote instead of setting commands
    public void setButtonCommands(int buttonIdx , Command buttonCommand) {
        if(0 <= buttonIdx && buttonIdx < numOfButtons) {
            buttonCommands[buttonIdx] = buttonCommand;
            buttonPressed[buttonIdx] = false;
        } else {
            System.out.println("Please enter correct button number");
        }
    }

    public void pressButton(int buttonIdx) {
        if(0 <= buttonIdx && buttonIdx < numOfButtons) {
            if(buttonCommands[buttonIdx] == null) {
                System.out.println("No command for pressed button");
                return;
            }

            if(buttonPressed[buttonIdx]) {
                buttonCommands[buttonIdx].undo();
                buttonPressed[buttonIdx] = false;
            } else {
                buttonCommands[buttonIdx].execute();
                buttonPressed[buttonIdx] = true;
            }
        } else {
            System.out.println("Please enter correct button number");
        }
    }
}
