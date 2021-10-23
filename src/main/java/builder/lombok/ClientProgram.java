package builder.lombok;

public class ClientProgram {

    public static void main(String[] args) {

        Client client = Client.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .address(Address.builder().city("Bydgoszcz").build())
                .myWallet(5000)
                .build();

        System.out.println(client);
    }
}
