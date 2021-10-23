package abstractfactory.pizza;

public abstract class Pizza {
    private String nazwa;
    private Ciasto ciasto;
    private Ser ser;
    private Sos sos;

    public abstract void przygotowanie();

    public void pieczenie() {
        System.out.println("Pieczenie 25 minut...");
    }

    public void krojenie() {
        System.out.println("Krojenie na 8 kawałków");
    }

    public void pakowanie() {
        System.out.println("Pakowanie do kartona");
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Ciasto getCiasto() {
        return ciasto;
    }

    public void setCiasto(Ciasto ciasto) {
        this.ciasto = ciasto;

        System.out.println(ciasto);
    }

    public Ser getSer() {
        return ser;
    }

    public void setSer(Ser ser) {
        this.ser = ser;

        System.out.println(ser);
    }

    public Sos getSos() {
        return sos;
    }

    public void setSos(Sos sos) {
        this.sos = sos;

        System.out.println(sos);
    }
}
