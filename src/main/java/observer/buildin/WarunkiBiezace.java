package observer.buildin;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements Observer {

    private float temp, wilgotnosc, cisnienie;

    private void wyswietl() {
        System.out.println("Warunki bieżące:");
        System.out.println(" - " + temp + " stopni");
        System.out.println(" - " + wilgotnosc + " % wilgotności");
        System.out.println(" - " + cisnienie + " hPa");
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof StacjaPogodowa) {
            StacjaPogodowa stacjaPogodowa = (StacjaPogodowa) observable;

            this.temp = stacjaPogodowa.getTemp();
            this.wilgotnosc = stacjaPogodowa.getWilgotnosc();
            this.cisnienie = stacjaPogodowa.getCisnienie();

            wyswietl();
         }
    }
}
