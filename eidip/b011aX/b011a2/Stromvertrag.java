package b011a2;

public class Stromvertrag {
    private static int anzahl = 0;
    private int nummer;
    private String name;
    private int monat;
    private int zaehler;

    public Stromvertrag(String name, int monat, int zaehler) {
        ++anzahl;
        this.nummer = anzahl;
        this.name = name;
        if (monat < 0) {
            throw new IllegalArgumentException("Monat darf nicht negativ sein");
        }
        this.monat = monat;
        this.zaehler = zaehler;
    }

    public static int anzahl() {
        return anzahl;
    }

    public int nummer() {
        return nummer;
    }

    public int monat() {
        return monat;
    }

    public int zaehler() {
        return zaehler;
    }

    public int kostenFix(int monate) {
        if (monate < 0) {
            throw new IllegalArgumentException("Monat darf nicht negativ sein");
        }
        return 1000 * monate;
    }

    public int kostenVariabel(int monate, int kWh) {
        if (monate < 0 | kWh < 0) {
            throw new IllegalArgumentException("Monat darf nicht negativ sein");
        }
        return 30 * kWh;
    }

    public int rechnung(int monat, int zaehlerstand) {
        int m = monat - this.monat;
        int z = zaehlerstand - this.zaehler;
        this.monat = monat;
        this.zaehler = zaehlerstand;
        return kostenFix(m) + kostenVariabel(m, z);
    }

    public static void main(String[] args) {
        Stromvertrag.anzahl();
        StromvertragOeko.anzahl();
        Stromvertrag sv1 = new Stromvertrag("Hubert Bogart", 3, 42539);
        Stromvertrag.anzahl();
        StromvertragOeko.anzahl();
        sv1.anzahl();
        sv1.nummer();
        sv1.monat();
        sv1.zaehler();
        sv1.kostenFix(5);
        sv1.kostenVariabel(5, 1100);
        System.out.println(sv1.rechnung(8, 43639));
        Stromvertrag.anzahl();
        sv1.anzahl();
        sv1.nummer();
        System.out.println(sv1.monat());
    }
}
