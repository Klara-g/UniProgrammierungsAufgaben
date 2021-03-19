package b09a1;
/**
 * @author kgolub2s
 */

public class Datum {

    // Eigenschaften des Objektes - Klassenattribute
    private int jahr;
    private int monat;
    private int tag;
   
    private static boolean monatAlsWort = false;
    private static char trenner = '-';
    private static int reihenfolge = 0;

    public Datum() { 
        this.jahr = 1;
        this.monat = 1;
        this.tag = 1;

    }

   /*public Datum getThisTomorrow() {
        this.tag++;
        return this;
    }

    public void naechsterTag() {
        this.tag++;
    }*/

    public Datum(int j) { 
        this.jahr = j;
        this.monat = 1;
        this.tag = 1;
    }

    public Datum(int j, int m) {
        this.jahr = j;
        this.monat = m;
        this.tag = 1;
    }

    public Datum(int j, int m, int t) {
        if(j <= 0){
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + j);
        }
        this.jahr  = j;
        if(m < 1 || m > 12){
            throw new IllegalArgumentException("ungueltiger Wert fuer Monat: " + m);
        }
        this.monat = m;
        if(t < 1 || t > tageInMonat(j, m) ){ // erst jahr, monat nach gülzigkeit überprüfen
            throw new IllegalArgumentException("ungueltiger Wert fuer Tag: " + t);
        }
        this.tag = t;
    }

    public Datum(Datum kopieDatum) {
        this.jahr = kopieDatum.jahr;
        this.monat = kopieDatum.monat;
        this.tag = kopieDatum.tag;
    }

    public int jahr() {
        return this.jahr;
    }

    public int monat() {
        return this.monat;
    }

    public int tag() {
        return this.tag;
    }

    public boolean equals(Datum vorgabeDatum) {
        if (this.jahr != vorgabeDatum.jahr) {
            return false;
        }
        if (this.monat != vorgabeDatum.monat) {
            return false;
        }
        if (this.tag != vorgabeDatum.tag) {
            return false;
        } else {
            return true; 
        }
    }

    public boolean istFrueher(Datum spaeteresDatum) { // spaetererDatum ist später passiert (true)- im blick auf die
                                                      // vergangenheit
        if (spaeteresDatum.jahr == this.jahr) {
            if (spaeteresDatum.monat == this.monat) {
                
                return (spaeteresDatum.tag > this.tag);
             
            } else {
                return (spaeteresDatum.monat > this.monat);
            }
        } else {
            return (spaeteresDatum.jahr > this.jahr);
        }
    }

    public String toString() {
        // Monat-String und Tag-String
        String jahrString = "" + this.jahr;
        String monatString = "";
        String tagString = "";
        if (monat < 10) {
            monatString = "0" + this.monat;
        } else {
            monatString = "" + this.monat;
        }
        if (tag < 10) {
            tagString = "0" + tag;
        } else {
            tagString = "" + tag;
        }
        // jmt = 1, mtj= 2, tmj= 3
        if (monatAlsWort) {
            monatString = nameVonMonat(monat);
            tagString = tagString + ".";
        }

        if (reihenfolge <= 1) {
            return jahrString + trennzeichen() + monatString + trennzeichen() + tagString;
        } else if (reihenfolge == 2) {
            return monatString + trennzeichen() + tagString + trennzeichen() + jahrString;
        } else {
            return tagString + trennzeichen() + monatString + trennzeichen() + jahrString;
        }

        // wenn einstellig Monat/Tageszahl, dann 0 vorangestellt 2019-03-08

    }
    //trenner ist char '-' am anfang gesetzt
    public static char trennzeichen() { // static
        return trenner;
    }

    public static void setFormatTZ(char newsymbol) { //trennzeichen

        if (newsymbol == '0') {
            monatAlsWort = true; //in toString - Abfrage
            trenner = ' ';
        } else {
            monatAlsWort = false;
            trenner = newsymbol;
        }
    }

    public static void setFormatRF(String neueReihenfolge) throws IllegalArgumentException {
        // jmt = 1, mtj= 2, tmj= 3
        //Alternative: Switch-Case
        // Beim Aufrufen von equals NullpointerExceptions wird eh geworfen
        if (neueReihenfolge.equals("jmt")) {
            reihenfolge = 1;
            return;
        }
        if (neueReihenfolge.equals("mtj")) {
            reihenfolge = 2;
            return;
        }
        if (neueReihenfolge.equals("tmj")) {
            reihenfolge = 3;
            return;
        }
        throw new IllegalArgumentException("ungueltiger Wert fuer Format-Reihenfolge: \"" + neueReihenfolge + "\"");
        
    }
    // entweder jmt tmj mtj
    // zuständig für korrekte, ensprechende Reihenfolg

    public static String nameVonMonat(Datum d) throws NullPointerException { 
        
        if(d == null){
            throw new NullPointerException("ungueltiger Wert fuer Format-Reihenfolge: \"" + "d" + "\"");

        }
        return nameVonMonat(d.monat());

    }

    public static String nameVonMonat(int zahl) {

        switch (zahl) {
            case 0:
                return "fehler";
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "Maerz";
            case 4:
                return "April";
            case 5:
                return "Mai";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Dezember";
            default:
                return "Fehler";

        }
    }

    public static int monatVonName(String name) {

        switch (name) {
            case "Januar":
                return 1;
            case "Februar":
                return 2;
            case "Maerz":
                return 3;
            case "April":
                return 4;
            case "Mai":
                return 5;
            case "Juni":
                return 6;
            case "Juli":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "Oktober":
                return 10;
            case "November":
                return 11;
            case "Dezember":
                return 12;
            default:
                return 0;
        }

    }

    public static boolean istSchaltjahr(int a) throws IllegalArgumentException{
        if(a < 1){
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + a);
        }
        if (1582 > a) {
            if (a % 4 == 0) {
                return true;
            }
        }
        if (1583 < a) {
            if (a % 25 == 0) {
                if (a % 100 != 0) {
                    return true;
                }
                if (a % 100 == 0 & a % 400 == 0) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    public static int tageInMonat(int jahresAngabe, int monatsAngabe) throws IllegalArgumentException {
        int tage = 0;
        if(monatsAngabe < 1 || monatsAngabe > 12){
            throw new IllegalArgumentException("ungueltiger Wert fuer Monat: "+ monatsAngabe);
        }
        if(jahresAngabe <= 0){
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + jahresAngabe);

        }
        if (tage > 31) {
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + tage);
        }
        
        switch (monatsAngabe) { //int gegeben als Argument
            case 2:
            if(istSchaltjahr(jahresAngabe)){ //ist Jahr ein Schaltjahr?
                tage = 29;
            }else{
                tage = 28;
            }
                break;
            case 4: //4 - 9 gleiche Ausgabe wie 11 (tage = 30)
            case 6:
            case 9:
            case 11:
                tage = 30;
                break;
            default: //in jeden anderen Fall
                // Ann.: monat OK
                tage = 31;
                break;
            
        }
        return tage;
    }



    //letzter Aufgabenparagrapxh
}