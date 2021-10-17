package state;

public class VendingMachine {

    private VendingMachineState state;
    private int amount;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void buyProduct(int amount) {
        this.amount = amount;
        state.getProduct(amount, this);
    }

    public void takeProduct() {
        state.getProduct(amount, this);
    }
}
