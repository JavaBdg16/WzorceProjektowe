package observer.weather;

import java.util.ArrayList;
import java.util.List;

public class StacjaPogodowa implements Podmiot {

    private List<Obserwator> obserwatorList = new ArrayList<>();
    private float temp, wilgotnosc, cisnienie;

    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwatorList.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        obserwatorList.remove(obserwator);
    }

    @Override
    public void powiadomObserwatorow() {
        obserwatorList.forEach(o -> o.aktualizacja(temp, wilgotnosc, cisnienie));
    }

    public void ustawStan(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;

        powiadomObserwatorow();
    }
}
