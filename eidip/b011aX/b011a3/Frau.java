package b011a3;

public class Frau extends Mensch {
    private static int anzahl = 0;

    public Frau(String name, int alter, int groesse, int gewicht) {
        super(name, alter, groesse, gewicht);
        ++anzahl;
    }

    public static int anzahl() {
        return anzahl;
    }

    @Override
    public String chromosomen() {
        return "XX";
    }

    @Override
    public int preisHaarschnitt() {
        return (int) Math.round(20 + (2. / 3. * super.alter()));
    }

    @Override
    public int groesse() {
        return super.groesse() - 5;
    }
}
