/**
 * @author kgolub2s
 */

public class Datum {

    // Eigenschaften des Objektes - Klassenattribute
    private int jahr;
    private int monat;
    private int tag;
    // Klassenattribute - Variabeln
    private static boolean monatAlsWort = false;
    private static char trenner = '-';
    private static int reihenfolge = 0;

    public Datum() { // Erster Konstruktor
        jahr = 1;
        monat = 1;
        tag = 1;          
    }
    public Datum(int j) { // das mir gegebene Jahr
        this.jahr = j; // setzt nur das Jahr auf die Eingabe
        this.monat = 1;
        this.tag = 1;
        //this(j,1); 
    }

    public Datum(int j, int m) {
        this.jahr = j;
        this.monat = m;
        this.tag = 1;
    }

    public Datum(int j, int m, int t) {
        if(j <= 0 ){
            throw new IllegalArgumentException();
        }
        jahr = j;
        monat = m;
        tag = t;
    }

    public Datum(Datum kopieDatum) {
        jahr = kopieDatum.jahr;
        monat = kopieDatum.monat;
        tag = kopieDatum.tag;
    }
    
    /*public Datum getThisTomorrow() {
        this.tag++;
        return this;
    }
    public void naechsterTag() {
        this.tag++; 
    }*/
    //getter Methoden:
    public int jahr() {
        return jahr;
    }

    public int monat() {
        return monat;
    }

    public int tag() {
        return tag;
    }

    public boolean equals(Datum vorgabeDatum) { 
        if (jahr != vorgabeDatum.jahr) {// (Objektbestandteil != Wert der Insatnzvariable von der Referenz)
            return false;
        }
        if (monat != vorgabeDatum.monat) {
            return false;
        }
        if (tag != vorgabeDatum.tag) {
            return false;
        } else {
            return true; 
        }
    }

    public boolean istFrueher(Datum spaeteresDatum) { // spaetererDatum ist später passiert (true)- im blick auf die
                                                      // vergangenheit
        if (spaeteresDatum.jahr == jahr) {
            if (spaeteresDatum.monat == monat) {
               
                return (spaeteresDatum.tag > tag);
               
            } else {
                return (spaeteresDatum.monat > monat);
            }
        } else {
            return (spaeteresDatum.jahr > jahr);
        }
       
    }

    public String toString() {
        // Monat-String und Tag-String
        String jahrString = "" + jahr;
        String monatString = "";
        String tagString = "";
        // wenn einstellig Monat/Tageszahl, dann 0 vorangestellt 2019-03-08
        if (monat < 10) {
            monatString = "0" + monat;
        } else {
            monatString = "" + monat;
        }
        if (tag < 10) {
            tagString = "0" + String.valueOf(tag);
        } else {
            tagString = "" + tag;
        }
        if (monatAlsWort) { //muss von anderer Funktion true gesetzt werden (setFormatTZ) 
            monatString = nameVonMonat(monat);
            tagString = tagString + ".";
        }
        // jmt = 1, mtj= 2, tmj= 3
        if (reihenfolge <= 1) {
            return jahrString + trennzeichen() + monatString + trennzeichen() + tagString;
        } else if (reihenfolge == 2) {
            return monatString + trennzeichen() + tagString + trennzeichen() + jahrString;
        } else {
            return tagString + trennzeichen() + monatString + trennzeichen() + jahrString;
        }
    }

    public static char trennzeichen() { 
        return trenner;
    }

    public static void setFormatTZ(char newsymbol) {

        if (newsymbol == '0') {
            monatAlsWort = true;
            trenner = ' '; //angabe ist Klassenvariabel

        } else {
            monatAlsWort = false;
            trenner = newsymbol;
        }
    }

    public static void setFormatRF(String neueReihenfolge) throws IllegalArgumentException {
        // jmt = 1, mtj= 2, tmj= 3
        if (neueReihenfolge.equals("jmt")) {
            reihenfolge = 1;
        }
        if (neueReihenfolge.equals("mtj")) {
            reihenfolge = 2;
        }
        if (neueReihenfolge.equals("tmj")) {
            reihenfolge = 3;
        }
        throw new IllegalArgumentException("ungueltiger Wert fuer Format-Reihenfolge: \"" + neueReihenfolge + "\"");

    }
    // entweder jmt tmj mtj
    // zuständig für korrekte, ensprechende Reihenfolg

    public static String nameVonMonat(Datum d) throws NullPointerException { //!!! verständnis wofür 
        
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
                return nameVonMonat(zahl % 12);

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
            throw new IllegalArgumentException("ungueltiger Wert fuer Monat: \"" + monatsAngabe + "\"");
        }
        if(jahresAngabe <= 0){
            throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: \"" + jahresAngabe + "\"");

        }
        
        switch (monatsAngabe) {
            case 2:
            if(istSchaltjahr(jahresAngabe)){
                tage = 29;
            }else{
                tage = 28;
            }
                break;
            case 4: //läuft duch bis case 11 - es wird das gleiche ausgeführt 
            case 6:
            case 9:
            case 11:
                tage = 30;
                break;
            default:
                // Ann.: monat OK
                tage = 31;
                break;
        }
        return tage;
    }

}
