package observer.weather;

public class StacjaPogodowaProgram {

    public static void main(String[] args) {

        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();

        WarunkiBiezace warunkiBiezace = new WarunkiBiezace(stacjaPogodowa);
        WarunkiBiezaceCisnienia warunkiBiezaceCisnienia = new WarunkiBiezaceCisnienia(stacjaPogodowa);

        stacjaPogodowa.ustawStan(8.5f, 10, 1000);
        System.out.println("");
        stacjaPogodowa.ustawStan(8f, 12, 1080);
    }
}
