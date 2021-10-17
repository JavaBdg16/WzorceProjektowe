package state;

public class DepositVendingMachineState extends VendingMachineState {

    @Override
    public void getProduct(int amount, VendingMachine vendingMachine) {
        System.out.println("Thrown into vending machine " + amount + " $");

        if (amount == 5) {
            System.out.println("Payment accepted");
            vendingMachine.setState(new TakeProductVendingState());
        } else if (amount > 5) {
            System.out.println("Payment accepted, pay the rest of money " + (amount - 5));
            vendingMachine.setState(new TakeProductVendingState());
        } else {
            System.out.println("Not enough money");
        }
    }
}
