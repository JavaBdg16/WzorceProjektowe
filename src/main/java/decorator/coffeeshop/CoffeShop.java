package decorator.coffeeshop;

import java.lang.annotation.Native;

public class CoffeShop {

    public static void main(String[] args) {

        Napoj napoj = new KawaBezkofeinowa();
        System.out.println(napoj.pobierzNazwe() + " PLN " + napoj.koszt());

        napoj = new KawaBezkofeinowa();
        napoj = new Cukier(napoj);
        napoj = new Cukier(napoj);
        napoj = new BitaSmietana(napoj);
        System.out.println(napoj.pobierzNazwe() + " PLN " + napoj.koszt());

        napoj = new BitaSmietana(
                new Cukier(
                        new Cukier(
                                new KawaBezkofeinowa())));
        System.out.println(napoj.pobierzNazwe() + " PLN " + napoj.koszt());
    }
}
