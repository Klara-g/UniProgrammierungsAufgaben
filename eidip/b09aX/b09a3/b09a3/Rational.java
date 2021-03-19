package b09a3;
/**
 * @author kgolub2s
 */

// mit John Meyerhoff (Informatik) in Partnerarbeit gemacht :)
public class Rational {
    private int zaehler;
    private int nenner;

    public Rational() {
        zaehler = 0;
        nenner = 1;
    }

    public Rational(int z) {
        zaehler = z;
        nenner = 1;
    }
    
    /*public Rational(String a, String b) {
        if (Integer.parseInt(b) == 0) {
            throw new ArithmeticException("ungueltiger Bruch");
        }
        zaehler = Integer.parseInt(a); //ich weise zaehler den Rückgabewert zu
        nenner = Integer.parseInt(b);
    }*/


    public Rational(int z, int n) throws ArithmeticException { // public ist modifier
        if (n == 0) {
            throw new ArithmeticException("ungueltiger Bruch");
        }
        // zaehler = z; // nicht unbedingt nötig, da zeile 22 und 23
        int zAbs = (z > 0) ? z : -z;
        int nAbs = (n > 0) ? n : -n;
        int ggT = Mathe.ggT(nAbs, zAbs); // nur int als zahl übergeben, nochz Datentyp int!
        this.zaehler = z / ggT; // % nur bei Restrechnung, sonst /
        this.nenner = n / ggT;

        if (this.nenner < 0) {
            this.nenner = -this.nenner;
            this.zaehler = -this.zaehler;
        }
    }

    public Rational(Rational original) {
        this.nenner = original.nenner;
        this.zaehler = original.zaehler;

    }

    public int zaehler() { 
        return this.zaehler;
    }

    public int nenner() {
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

    public Rational abs() { //
        // Rational absolutbetrag = new Rational(this.zaehler, this.nenner);
        if (this.zaehler > 0) {
            return new Rational(this.zaehler, this.nenner);
        } else {
            // absolutbetrag.zaehler = this.zaehler*(-1); //eine objektfunktion - nicht
            // statisch
            return new Rational(-this.zaehler, this.nenner);
        }
    }

    public Rational rez() { //Kehrwert

        return new Rational(this.nenner, this.zaehler);
    }

    public Rational add(Rational addition) { // summand

        int nennergesamt = this.nenner * addition.nenner;
        int zaehlergesamt = (this.zaehler * addition.nenner);
        zaehlergesamt += (this.nenner * addition.zaehler);
        return new Rational(zaehlergesamt, nennergesamt);
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

    public String toString() {
        String zaehlerString = "" + zaehler;
        String nennerString = "" + nenner;
        return zaehlerString + "/" + nennerString;
    }

    public static Rational parse(String s) { // "-2/3" "45/69"
        if (!s.contains("/")) {
            throw new IllegalArgumentException("ungueltiger Wert fuer Rational");
        }
        int a = 0;
        int b = 1;
        int trennzeichen = s.indexOf('/');
        // -23/45 -2/4

        String ersterTeil = s.substring(0, trennzeichen);
        String zweiterTeil = s.substring(trennzeichen + 1, s.length()); 
        a = Integer.parseInt(ersterTeil);
        b = Integer.parseInt(zweiterTeil);
        return new Rational(a, b);
      
    }
}