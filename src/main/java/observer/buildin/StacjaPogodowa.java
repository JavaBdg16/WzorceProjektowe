package observer.buildin;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class StacjaPogodowa extends Observable {

    private float temp, wilgotnosc, cisnienie;

    public void powiadomObserwatorow() {
        setChanged();
        notifyObservers();
    }

    public void ustawStan(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;

        powiadomObserwatorow();
    }

    public float getTemp() {
        return temp;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public float getCisnienie() {
        return cisnienie;
    }
}
