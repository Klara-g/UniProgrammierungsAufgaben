package b07a2;
/**
 * @author kgolub2s
 */

// mit John Meyerhoff (Informatik) in Partnerarbeit gemacht :)

public class Rational {
    private int zaehler; // Instanzvariablen
    private int nenner;

    public Rational() {
        zaehler = 0;
        nenner = 1;
    }

    public Rational(int z) {
        zaehler = z;
        nenner = 1;
    }

    public Rational(int z, int n) throws ArithmeticException {
        // für gekürzte Form des Bruchs
        if (n == 0) {
            throw new ArithmeticException("ungültiger Bruch");
        }
        // absolut = -3 > 0 ? -3 : --3
        int zAbs = (z > 0) ? z : -z;
        int nAbs = (n > 0) ? n : -n;
        int ggT = Mathe.ggT(nAbs, zAbs); // ggT nimmt positive Ganzzahlen entgegen
        this.zaehler = z / ggT; // z wird durch größten Teiler(positiv) von z und n geteilt
        this.nenner = n / ggT;// ggT zweier ungleicher Primzahlen ist 1 , 1 ist neutrale Element
        // für normalisierte Form: das Vorzeichen von Zähler und Nenner wechseln,
        // falls letzterer negativ ist
        if (this.nenner < 0) {
            this.nenner = -this.nenner;
            this.zaehler = -this.zaehler;
        }
    }

    public Rational(Rational original) {
        nenner = original.nenner;
        zaehler = original.zaehler;

    }

    public int zaehler() {
        return this.zaehler;
    }

    public int nenner() { // Kapselung für nenner private - Nenner von außerhalb lesbar,aber unveränderbar
        return this.nenner;
    }

    public boolean equals(Rational bruch) {
        if (this.zaehler != bruch.zaehler()) {
            return false;
        }
        if (this.nenner != bruch.nenner()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean istKleiner(Rational compare) {
        // this = 5/7 und compare = 7/11
        // return 55 < 49
        return ((this.zaehler * compare.nenner()) < (this.nenner * compare.zaehler()));
    }

    public Rational abs() { // absolutwert
        if (this.zaehler > 0) {
            return new Rational(this.zaehler, this.nenner); // nenner muss positiv sein - Konstruktor (3)
        } else {
            return new Rational(-this.zaehler, this.nenner); // neues Objekt
        }
    }

    public Rational rez() { // Kehrwert

        return new Rational(this.nenner, this.zaehler);
    }

    public Rational add(Rational addition) { // summand
        // nach Formel vom AB
        int nennergesamt = this.nenner * addition.nenner;
        int zaehlergesamt = (this.zaehler * addition.nenner);
        zaehlergesamt += (this.nenner * addition.zaehler);
        return new Rational(zaehlergesamt, nennergesamt); // im Konstruktor wird gekürzt
    }

    public Rational sub(Rational subtraktion) {
        int nennergesamt = this.nenner * subtraktion.nenner;
        int zaehlergesamt = (this.zaehler * subtraktion.nenner);
        zaehlergesamt -= (this.nenner * subtraktion.zaehler);

        return new Rational(zaehlergesamt, nennergesamt);
    }

    public Rational mul(Rational faktor) {
        int nennergesamt = this.nenner * faktor.nenner;
        int zaehlergesamt = (this.zaehler * faktor.zaehler);

        return new Rational(zaehlergesamt, nennergesamt);
    }

    public Rational div(Rational divisor) {
        int nennergesamt = this.nenner * divisor.zaehler; // instanz * anderes objekt
        int zaehlergesamt = (this.zaehler * divisor.nenner);

        return new Rational(zaehlergesamt, nennergesamt);
    }

    /*
     * public RationalEins div1(RationalEins divisor) { //mit dem Kehrwert
     * multiplizieren return this.rez().mul(divisor); }
     */

    public String toString() {
        String zaehlerString = "" + this.zaehler; //valueOf()
        String nennerString = "" + this.nenner;
        return zaehlerString + "/" + nennerString;
    }
//Blatt 9:
    public static Rational parse(String s) { // "-2/3" "45/69"
        if (!s.contains("/")) {
            throw new IllegalArgumentException("ungueltiger Wert fuer Rational");
        }
        int a = 0;
        int b = 1;
        int trennzeichen = s.indexOf('/');
        // -23/45 
        String ersterTeil = s.substring(0, trennzeichen);
        String zweiterTeil = s.substring(trennzeichen + 1, s.length());
        a = Integer.parseInt(ersterTeil);
        b = Integer.parseInt(zweiterTeil);
        return new Rational(a, b);
    }
}
