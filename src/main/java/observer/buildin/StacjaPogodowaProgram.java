package observer.buildin;

public class StacjaPogodowaProgram {

    public static void main(String[] args) {

        // obserwowany
        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();

        // obserwujący
        WarunkiBiezace warunkiBiezace = new WarunkiBiezace();
        WarunkiBiezaceCisnienia warunkiBiezaceCisnienia = new WarunkiBiezaceCisnienia();

        // dodajemy obserwujących do obserwowanego
        stacjaPogodowa.addObserver(warunkiBiezace);
        stacjaPogodowa.addObserver(warunkiBiezaceCisnienia);

        stacjaPogodowa.ustawStan(8.5f, 10, 1000);
        System.out.println("");
        stacjaPogodowa.ustawStan(8f, 12, 1080);
    }
}
