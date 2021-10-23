package builder.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Client {

    @Getter
    @Setter
    private String firstName;
    private String lastName;
    private Address address;
    @Getter
    private double myWallet;

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
