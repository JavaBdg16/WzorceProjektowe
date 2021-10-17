package observer.weather;

public class WarunkiBiezace implements Obserwator {

    private final Podmiot podmiot;
    private float temp, wilgotnosc, cisnienie;

    public WarunkiBiezace(Podmiot podmiot) {
        this.podmiot = podmiot;
        this.podmiot.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;

        wyswietl();
    }

    private void wyswietl() {
        System.out.println("Warunki bieżące:");
        System.out.println(" - " + temp + " stopni");
        System.out.println(" - " + wilgotnosc + " % wilgotności");
        System.out.println(" - " + cisnienie + " hPa");
    }
}
