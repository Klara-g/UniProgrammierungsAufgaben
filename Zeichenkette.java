/**
 * @author kgolub2s
 */
/**
 * Nr. 1 //a) zurück, - ausschließlich Ziffern - keine White Spaces zugelassen (auch nicht am Anfang
 * oder Ende) - leere Zeichenkette ist gültige (eben leere) Ziffernfolge Z.B. Aufruf mit Argument
 * "Hallo, Welt!" = false ein Aufruf mit Argument "451" = true.
 */

public class Zeichenkette {

    /**
     * @param  s
     *           Zeichenkette die überprüft werden soll
     * @return   Wahrheitswert, ob s ausschließlich Ziffern enthält(true) oder nicht(false)
     */
    public static boolean istZiffernfolge(String s) {

        int i = 0; // Zähler + Schleife durchlaufen
        while (i < s.length()) { // Zähler muss kleiner als gesamter String sein
            char c = s.charAt(i); // von String s an der Stelle i
            if (Character.isDigit(c)) {} else {
                return false;
            }

            i = i + 1;
        }
        return true;
    }

    // b)

    /*
     * - nimmt Zeichnekette als Arguent - gibt Wahrehitswert zurück - ausschließlich Buchstaben oder
     * Bindestriche - Bindestrich nicht als erstes oder letztes - keine Whitespaces zugelassen
     * (nicht Angfang/Ende) - leere Zeichenkette gültig - "Lisa-" oder "Johann Wolfgang" = false
     * (letzteres mit WhiteSpace) - "Brad-Arnold" oder "ey" = true
     */

    public static boolean istName(String s) {
        int i = 0; // Zähler
        if (s.length() == 0) { // wenn kein Strin/keine Ziffern ????
            return true;
        }
        if (!(Character.isLetter(s.charAt(0)))) { // Schauen ob an erster Stelle etwas anderes ist
                                                  // als Buchstabe
            // System.out.println("erster Fehler"); //zum Testen wo Fehler sich befindet
            return false;
        }
        if (!Character.isLetter(s.charAt(s.length() - 1))) { // Schauen ob an letzter Stelle etwas
                                                             // anderes ist als
                                                             // Buchstabe
            // System.out.println("zweiter Fehler");
            return false;

        }
        while (i < s.length()) { // wenn Zähler größer ist als gesamte Länge des Strings
            char c = s.charAt(i); // an Stelle des Zählers
            char b = '-'; // Bindestrich deklariert

            if (Character.isLetter(c)) { // Wenn Buchstabe an der Stelle/Zahl c...
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
     * - Zeichenkette als Argument - gibt zurück, wieviele Buchstaben diese enthält -
     * Z.B."Hallo, Welt!" = 9.
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
     * - zeichenkette als Argument - Zeichenkette zurück - Vokale a, e, i, o, u groß geschrieben -
     * alle anderen Buchstaben klein - zb. Hallo, Welt! wird zu hAllO, wElt!
     */

    public static String vokaleGross(String s) {
        int i = 0; // Zähler
        String r = "";
        char c = 0;

        while (s.length() > i) {
            c = s.charAt(i); // ab Zeichen an bearbeitet Postion
            if (Character.isLetter(c) & (c == 'a') | (c == 'e' | c == 'i' | c == 'o' | c == 'u')) { // ''
                                                                                                    // statt
                                                                                                    // "
                                                                                                    // "

                // r += Character.toUpperCase(c);
                c = Character.toUpperCase(c); // bearbeitende Stelle zu Großbuchstaben

            } else {

                if (Character.isLetter(c) & (c == 'A')
                        | (c == 'E' | c == 'I' | c == 'O' | c == 'U')) {

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
        System.out.println(r);
        return r;

    }
    /*
     * Nr. 2 a) /* - Zeichenkette als Argument - Rückgabe: wieviele Buchstaben diese enthält - Z.B.
     * Aufruf mit Argument "Hallo, Welt!"= Zahlwert 9.
     */

    public static String rueckwaerts(String vorwaerts) {
        String rueckwert = ""; // leer/nix
        int countdown = vorwaerts.length() - 1; // letzter Buchstabe & gleichzeitig Zähler
        while (countdown >= 0) { // mindestens 1 Buchstabe
            rueckwert += vorwaerts.charAt(countdown); // leer + den String an der Stelle des
                                                      // countdown

            countdown--; // Zähler minus 1
        }
        return rueckwert; // leer + angehängter Buchstabe
    }

    public static String einfuegung(String halbesWort, int position, String ganzesWort) {

        int halb = halbesWort.length(); // Int-Info von Wort
        // meine substrings/ 2te Hälfte
        String ersterTeil = halbesWort.substring(0, position); // von 0 bis Position
        String zweiterTeil = halbesWort.substring(position, halb); // von Position bis b

        return ersterTeil + ganzesWort + zweiterTeil;
    }

    // Main-Methode zum Prüfen

    // Eingabe:
    // "Ach Achim ..."
    // erwartet: "Ach AchIm ..."
    // erhalten: "ach achIm ..."
    public static String verkuerze(String s, int n) {

        // verkuerzt?
        // wort -(2n)+5 < ausgabe
        // -2n +5 < 0
        // 5 < 2n
        // wort.length > 2n+5
        int eingabe = s.length();
        int verkuerzt = n + 5 + n;
        boolean wirdverkuerzt = (eingabe >= verkuerzt);
        if (wirdverkuerzt) {
            int ende = s.length();
            String ersterTeil = s.substring(0, n);// die ersten N Zeichen
            String zweiterTeil = s.substring(s.length() - n, ende);// die letzten N Zeichen
            return ersterTeil + "[...]" + zweiterTeil;
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(verkuerze("Helikopterlandeplatz", 30));
        System.out.println(verkuerze("Helikopterlandeplatz", 20));
        System.out.println(verkuerze("Helikopterlandeplatz", 10));
        System.out.println(verkuerze("Helikopterlandeplatz", 5));

        System.out.println(verkuerze("Ei", 5));
        System.out.println(verkuerze("Ei", 4));
        System.out.println(verkuerze("Ei", 3));
        System.out.println(verkuerze("Ei", 2));
        System.out.println(verkuerze("Ei", 1));
        // vokaleGross("Ach Achim ...");
    }
}
