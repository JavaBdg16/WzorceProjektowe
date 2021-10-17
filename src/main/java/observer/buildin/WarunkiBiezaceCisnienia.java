package observer.buildin;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceCisnienia implements Observer {

//    private final Podmiot podmiot;
    private float cisnienie;

//    public WarunkiBiezaceCisnienia(Podmiot podmiot) {
//        this.podmiot = podmiot;
//        this.podmiot.zarejestrujObserwatora(this);
//    }

//    @Override
//    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
//        this.cisnienie = cisnienie;
//        wyswietl();
//    }

    private void wyswietl() {
        System.out.println("Aktualne cisnienie: " + cisnienie + "hPa");
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof StacjaPogodowa) {
            System.out.println(getClass().getSimpleName());
        }
    }
}
