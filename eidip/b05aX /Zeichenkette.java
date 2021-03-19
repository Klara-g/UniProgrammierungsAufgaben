/**
 * @author kgolub2s
 */
/**
 * Aufgabenblatt 5 istZiffernfolge
 */

public class Zeichenkette {

    /**
     * @param s Zeichenkette die überprüft werden soll
     * @return Wahrheitswert, ob s ausschließlich Ziffern enthält(true) oder
     *         nicht(false)
     */
    public static boolean istZiffernfolge(String s) {
        // "Tomate" - läuft nur ein Mal durch...direkt bei else raus
        int i = 0; // Zähler + Schleife durchlaufen
        while (i < s.length()) { // Zähler muss kleiner als gesamter String sein
            char c = s.charAt(i); // von String s an der Stelle i
            if (Character.isDigit(c)) { // Ziffern von 0 - 9
            } else {
                return false;
            }

            i = i + 1;
        }
        return true; // gültiger Wert bei s = 0 (edge case)
    }

    // b)

    /*
     * - nimmt Zeichnekette als Arguent - gibt Wahrehitswert zurück - ausschließlich
     * Buchstaben oder Bindestriche - Bindestrich nicht als erstes oder letztes -
     * keine Whitespaces zugelassen (nicht Angfang/Ende) - leere Zeichenkette gültig
     * - "Lisa-" oder "Johann Wolfgang" = false (letzteres mit WhiteSpace) -
     * "Brad-Arnold" oder "ey" = true
     */

    public static boolean istName(String s) {
        int i = 0; // Zähler
        if (s.length() == 0) { // wenn kein String/keine Ziffern ????
            return true;
        }
        if (!(Character.isLetter(s.charAt(0)))) {
            // Schauen ob an erster Stelle etwas anderes ist als Buchstabe
            // System.out.println("erster Fehler");
            // zum Testen wo Fehler sich befindet
            return false;
        }
        if (!Character.isLetter(s.charAt(s.length() - 1))) {
            // Schauen ob an letzter Stelle etwas anderes ist als Buchstabe
            // System.out.println("zweiter Fehler");
            return false;

        }
        while (i < s.length()) { // wenn Zähler größer ist als gesamte Länge des Strings
            char c = s.charAt(i); // an Stelle des Zählers
            char b = '-'; // Bindestrich deklariert

            if (Character.isLetter(c)) { // Wenn das Zeichen c ein Buchstabe ist
            } else {
                if (c != b) { // Wenn c ist NICHT Bindestrich
                    // System.out.println("Fehler");
                    return false; // da ausschließlich Buchstaben oder Bindestriche
                }
            }
            i = i + 1; // Zähler plus eins für nächste Ziffer
        }

        return true; // aus While- Schleife raus

    }

    /*
     * - Zeichenkette als Argument - gibt zurück, wieviele Buchstaben diese enthält
     * - Z.B."Hallo, Welt!" = 9.
     */

    public static int anzahlBuchstaben(String s) {
        int i = 0; // Zähler - muss zurückgegeben werden

        int buchstabe = 0;

        while (s.length() > i) { // wenn länge größer als 0
            char c = s.charAt(i); // sagt m ir Zahl der Postion
            if (Character.isLetter(c)) { // wenn Buchstabe, dann

                buchstabe = buchstabe + 1;
            }
            i = i + 1;
        }
        return buchstabe;
    }

    // d)
    /*
     * - zeichenkette als Argument - Zeichenkette zurück - Vokale a, e, i, o, u groß
     * geschrieben - alle anderen Buchstaben klein - zb. Hallo, Welt! wird zu hAllO,
     * wElt!
     */

    public static String vokaleGross(String s) {
        int i = 0; // Zähler
        String r = "";
        char c = 0;

        while (s.length() > i) {
            c = s.charAt(i); // ab Zeichen an bearbeitet Postion
            if (Character.isLetter(c) & (c == 'a') | (c == 'e' | c == 'i' | c == 'o' | c == 'u')) { // '' statt " "
                // r += Character.toUpperCase(c);
                c = Character.toUpperCase(c); // bearbeitende Stelle zu Großbuchstaben
            } else {
                if (Character.isLetter(c) & (c == 'A') | (c == 'E' | c == 'I' | c == 'O' | c == 'U')) {
                    // c = Character.toUpperCase(c) bewirkt hier keine Änderung
                } else {
                    /* if (Character.isLetter(c) & Character.isUpperCase(c)){ */
                    // r += Character.toLowerCase(c);
                    c = Character.toLowerCase(c);
                }
            }
            i = i + 1;
            r = r + c;
        }

        return r;
    }
    /*
     * Nr. 2
     * 
     * a)
     * 
     * /* - Zeichenkette als Argument - Rückgabe: wieviele Buchstaben diese enthält
     * - Z.B. Aufruf mit Argument "Hallo, Welt!"= Zahlwert 9.
     */

    public static String rueckwaerts(String vorwaerts) {
        String ergebnis = ""; // leer/nix
        int countdown = vorwaerts.length() - 1; // index der letzten Position
        while (countdown >= 0) { // mindestens 1 Buchstabe
            ergebnis += vorwaerts.charAt(countdown); // leer + den String an der Stelle des countdown

            countdown--; // Zähler minus 1
        }
        return ergebnis; // leer + angehängter Buchstabe
    }
    /*
     * public static boolean istPalindrom(String a){ //vowärts und rueckwärts gleich
     * return a.equals(rueckwaerts(a)); }
     */

    public static String einfuegung(String halbesWort, int position, String ganzesWort) {

        int halb = halbesWort.length(); // Int-Info von Wort
        // meine substrings/ 2te Hälfte
        String ersterTeil = halbesWort.substring(0, position); // von 0 bis Position
        String zweiterTeil = halbesWort.substring(position, halb); // von Position bis b

        return ersterTeil + ganzesWort + zweiterTeil;
    }

    public static String einfuegungOl(String halbesWort, int position, String ganzesWort) {

        return halbesWort.substring(0, position) + ganzesWort + halbesWort.substring(position, halbesWort.length());
    }

    // Main-Methode zum Prüfen

    // Eingabe:
    // "Ach Achim ..."
    // erwartet: "Ach AchIm ..."
    // erhalten: "ach achIm ..."

    /**
     * Aufgabe: Geben Sie den String s abgeändert zurück. Es werden die ersten und
     * letzten n Zeichen getrennt von […] zurückgegeben, sofern diese Rückgabe
     * kürzer wäre als s. [...] = 5 Zeichen
     */
    public static String verkuerze(String s, int n) {

        int laenge = s.length();
        int neueLaenge = n + 5 + n; // n zeichen vorne und hinten
        boolean wirdverkuerzt = (laenge > neueLaenge);
        if (wirdverkuerzt) {
            String ersterTeil = s.substring(0, n);// die ersten n Zeichen
            String zweiterTeil = s.substring(laenge - n, laenge);// die letzten n Zeichen
            return ersterTeil + "[...]" + zweiterTeil; // s in veränderter Form
        } else {
            return s;
        }
    }

    public static String verkuerzeAlternativ(String s, int n) {
        // Aufgabe: Geben Sie den String s abgeändert zurück. Es werden die ersten und
        // letzten n Zeichen
        // getrennt von […] zurückgegeben, sofern diese Rückgabe kürzer ist als s.
        // [...] = 5 Zeichen
        int laenge = s.length();
        String ersterTeil = s.substring(0, n);// die ersten n Zeichen
        String zweiterTeil = s.substring(laenge - n, laenge);// die letzten n Zeichen
        String ergebnis = ersterTeil + "[...]" + zweiterTeil;
        boolean wirdverkuerzt = (laenge > ergebnis.length());
        if (wirdverkuerzt) {
            return ergebnis; // s in veränderter Form
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(verkuerze("Ananassaft", 3));
        vokaleGross("Ach Achim ...");
    }
}
