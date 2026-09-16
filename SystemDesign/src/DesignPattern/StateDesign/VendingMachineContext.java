package DesignPattern.StateDesign;

public class VendingMachineContext {
    public VendingMachineState currState;

    public void setVendingMachineState(VendingMachineState state) {
        currState = state;
    }

    public void selectItem() {
        currState = currState.selectItem();
    }

    public void makePayment() {
        currState = currState.makePayment();
    }

    public void dispenseItem() {
        currState = currState.dispense();
    }

    public String getStateName() {
        return currState.getStateName();
    }
}
