package builder;

public class Address {
    private String city;
    private String street;
    private int homeNumber;
    private String zipCode;

    public Address(AddressBuilder addressBuilder) {
        city = addressBuilder.getCity();
        street = addressBuilder.getStreet();
        homeNumber = addressBuilder.getHomeNumber();
        zipCode = addressBuilder.getZipCode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
