package observer.weather;

public interface Obserwator {
    void aktualizacja(float temp, float wilgotnosc, float cisnienie);
}
