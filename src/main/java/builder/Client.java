package builder;

public class Client {
    private String firstName;
    private String lastName;
    private Address address;
    private double myWallet;

    public Client(Builder builder) {
        firstName = builder.getFirstName();
        lastName = builder.getLastName();
        address = builder.getAddress();
        myWallet = builder.getMyWallet();
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", myWallet=" + myWallet +
                '}';
    }
}
