package observer.buildin;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceCisnienia implements Observer {

    private float cisnienie;

    private void wyswietl() {
        System.out.println("Aktualne cisnienie: " + cisnienie + "hPa");
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof StacjaPogodowa) {
            StacjaPogodowa stacjaPogodowa = (StacjaPogodowa) observable;
            this.cisnienie = stacjaPogodowa.getCisnienie();

            wyswietl();
        }
    }
}
