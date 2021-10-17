package observer.buildin;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class StacjaPogodowa extends Observable {

//    private List<Obserwator> obserwatorList = new ArrayList<>();
    private float temp, wilgotnosc, cisnienie;

//    @Override
//    public void zarejestrujObserwatora(Obserwator obserwator) {
//        obserwatorList.add(obserwator);
//    }
//
//    @Override
//    public void usunObserwatora(Obserwator obserwator) {
//        obserwatorList.remove(obserwator);
//    }
//
    public void powiadomObserwatorow() {
//        obserwatorList.forEach(o -> o.aktualizacja(temp, wilgotnosc, cisnienie));

        setChanged();
        notifyObservers();
    }

    public void ustawStan(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;

        powiadomObserwatorow();
    }
}
