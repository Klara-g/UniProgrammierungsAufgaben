package b011a2;

public class StromvertragOeko extends Stromvertrag {
    private static int anzahl = 0;

    public StromvertragOeko(String name, int monat, int zaehler) {
        super(name, monat, zaehler);
        ++anzahl;
    }

    public static int anzahl() {
        return anzahl;
    }

    @Override
    public int kostenFix(int monate) {
        if (monate < 0) {
            throw new IllegalArgumentException("Monat darf nicht negativ sein");
        }
        return 1200 * monate;
    }

    @Override
    public int kostenVariabel(int monate, int kWh) {
        if (monate < 0 | kWh < 0) {
            throw new IllegalArgumentException("Monat darf nicht negativ sein");
        }
        return 35 * monate * kWh;
    }
}
