package DesignPattern.StateDesign;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext vendingMachine = new VendingMachineContext();
        vendingMachine.setVendingMachineState(new MenuState());

        System.out.println("Vending machine deployed....");
        System.out.println("Machine curr state: " + vendingMachine.getStateName());

        vendingMachine.selectItem();
        System.out.println("Machine curr state: " + vendingMachine.getStateName());

        vendingMachine.selectItem();
        System.out.println("Machine curr state: " + vendingMachine.getStateName());

        vendingMachine.makePayment();
        System.out.println("Machine curr state: " + vendingMachine.getStateName());

        vendingMachine.makePayment();
        System.out.println("Machine curr state: " + vendingMachine.getStateName());

        vendingMachine.dispenseItem();
        System.out.println("Machine curr state: " + vendingMachine.getStateName());

        vendingMachine.dispenseItem();
        System.out.println("Machine curr state: " + vendingMachine.getStateName());
    }
}
