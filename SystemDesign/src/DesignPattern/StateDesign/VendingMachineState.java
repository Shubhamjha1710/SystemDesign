package DesignPattern.StateDesign;

public interface VendingMachineState {
    public VendingMachineState selectItem();
    public VendingMachineState makePayment();
    public VendingMachineState dispense();
    public String getStateName();
}
