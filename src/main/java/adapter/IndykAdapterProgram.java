package adapter;

import java.util.ArrayList;
import java.util.List;

public class IndykAdapterProgram {

    public static void main(String[] args) {

        Indyk dzikiIndyk = new DzikiIndyk();
        dzikiIndyk.lataj();
        dzikiIndyk.gulgocz();

        Kaczka indyk = new IndykAdapter(dzikiIndyk);
        indyk.kwacz();
        indyk.lataj();

        List<Kaczka> kaczki = new ArrayList<>();
        kaczki.add(indyk);
    }
}
