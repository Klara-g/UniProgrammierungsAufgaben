package b011a3;

public class Mann extends Mensch {
    private static int anzahl = 0;

    public Mann(String name, int alter, int groesse, int gewicht) {
        super(name, alter, groesse, gewicht);
        ++anzahl;
    }

    public static int anzahl() {
        return anzahl;
    }

    @Override
    public String chromosomen() {
        return "XY";
    }

    @Override
    public int preisHaarschnitt() {
        return (int) Math.round(10 + 1. / 4. * alter());
    }

    @Override
    public int gewicht() {
        return super.gewicht() + 5;
    }

}
