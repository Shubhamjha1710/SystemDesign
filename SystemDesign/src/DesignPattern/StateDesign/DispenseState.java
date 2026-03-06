package DesignPattern.StateDesign;

public class DispenseState implements VendingMachineState{
    @Override
    public VendingMachineState selectItem() {
        System.out.println("Please dispense existing item first...");
        return this;
    }

    @Override
    public VendingMachineState makePayment() {
        System.out.println("Payment is already done...");
        return this;
    }

    @Override
    public VendingMachineState dispense() {
        System.out.println("Enjoy your day...");
        return new MenuState();
    }

    @Override
    public String getStateName() {
        return "DISPENSE_STATE";
    }
}
