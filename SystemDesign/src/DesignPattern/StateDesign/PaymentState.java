package DesignPattern.StateDesign;

public class PaymentState implements VendingMachineState{
    @Override
    public VendingMachineState selectItem() {
        System.out.println("Item is already selected...");
        return this;
    }

    @Override
    public VendingMachineState makePayment() {
        System.out.println("Payment is successfully executed...");
        return new DispenseState();
    }

    @Override
    public VendingMachineState dispense() {
        System.out.println("Please make payment first");
        return this;
    }

    @Override
    public String getStateName() {
        return "PAYMENT_STATE";
    }
}
