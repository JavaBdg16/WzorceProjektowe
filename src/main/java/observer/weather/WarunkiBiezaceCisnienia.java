package observer.weather;

public class WarunkiBiezaceCisnienia implements Obserwator {

    private final Podmiot podmiot;
    private float cisnienie;

    public WarunkiBiezaceCisnienia(Podmiot podmiot) {
        this.podmiot = podmiot;
        this.podmiot.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.cisnienie = cisnienie;
        wyswietl();
    }

    private void wyswietl() {
        System.out.println("Aktualne cisnienie: " + cisnienie + "hPa");
    }
}
