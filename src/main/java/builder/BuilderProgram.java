package builder;

public class BuilderProgram {

    public static void main(String[] args) {

        Client client = new Builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .address(
                        new AddressBuilder()
                                .city("Bydgoszcz")
                                .build())
                .myWallet(5000)
                .build();

        System.out.println(client);
    }
}
