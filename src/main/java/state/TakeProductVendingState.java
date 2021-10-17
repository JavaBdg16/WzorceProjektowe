package state;

public class TakeProductVendingState extends VendingMachineState {

    @Override
    public void getProduct(int amount, VendingMachine vendingMachine) {
        System.out.println("Money delivered, amount = " + amount + ". give product");
        vendingMachine.setState(new DepositVendingMachineState());
    }
}
