package DesignPattern.StateDesign;

public class MenuState implements VendingMachineState{
    @Override
    public VendingMachineState selectItem() {
        System.out.println("Item is selected moving to payment page");
        return new PaymentState();
    }

    @Override
    public VendingMachineState makePayment() {
        System.out.println("Please select item first");
        return this;
    }

    @Override
    public VendingMachineState dispense() {
        System.out.println("Please select item first");
        return this;
    }

    @Override
    public String getStateName() {
        return "MENU_STATE";
    }
}
