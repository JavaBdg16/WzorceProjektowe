package observer.weather;

public interface Podmiot {

    void zarejestrujObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void powiadomObserwatorow();
}
