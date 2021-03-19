package b011a3;

public abstract class Mensch {
    private static int anzahl = 0;
    private String name;
    private int alter;
    private int gewicht; // in kg
    private int groesse; // in cm

    public Mensch(String name, int alter, int groesse, int gewicht) {
        ++anzahl;
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public static int anzahl() {
        return anzahl;
    }

    public String name() {
        return name;
    }

    public abstract String chromosomen();

    public int alter() {
        return alter;
    }

    public static int volljaehrigkeitsAlter() {
        return 18;
    }

    public boolean istVolljaehrig() {
        return volljaehrigkeitsAlter() <= alter ? true : false;
    }

    public int gewicht() {
        return gewicht;
    }

    public int groesse() {
        return groesse;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public abstract int preisHaarschnitt();

    // public abstract String toString();
    public String toString() {
        return name() + " " + chromosomen() + " " + alter() + " " + istVolljaehrig() + " " + groesse() + " " + gewicht()
                + " " + preisHaarschnitt();
    }
}
