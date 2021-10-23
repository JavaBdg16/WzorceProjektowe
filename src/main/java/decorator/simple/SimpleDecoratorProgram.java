package decorator.simple;

public class SimpleDecoratorProgram {

    public static void main(String[] args) {

        Skladnik skladnik1 = new SkladnikPodstawowy();
        System.out.println(skladnik1.print());

        Skladnik skladnik2 = new SkladnikPodstawowy();
        skladnik2 = new DekoratorPodstawowyA(skladnik2);
        skladnik2 = new DekoratorPodstawowyB(skladnik2);
        System.out.println(skladnik2.print());

        Skladnik skladnik3 =
                new DekoratorPodstawowyB(
                        new DekoratorPodstawowyA(
                                new SkladnikPodstawowy()));

        System.out.println(skladnik3.print());

    }
}
