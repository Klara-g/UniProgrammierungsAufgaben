
/**
 * @author kgolub2s
 */
import java.util.Scanner;

public class Interpreter {
    public static String verarbeite(Scanner sc) {
        if(!sc.hasNextLine()){
        throw new IllegalArgumentException("Falsch");
        }
        // Position Zeichen in Zeichenfolge
        String vor = "vor"; // als SchlüsselWort vorgegeben
        boolean allesDavor = true; // wir kümmern uns um die Möglichkeit "vor" der Positionseingabe
        char zeichen = '0'; // char immer genau 1 zeichen, und hier zum späteren
                            // "überschreiben"/initialisieren - keine Bedeutung
        String zeichenfolge = ""; // auch zum Überschreiben
        int relevanterTreffer = 0; // zum überschreiben, die Stelle des erste Buchstaben (int) der dem Zeichen der
                                   // Eingabe entspricht
        boolean gefunden = false; // false ist der fixwert für "nicht gefunden" - bis dato nichts gelesen - also
                                  // nix gefunden
        while (sc.hasNext()) { // ab hier Einlesen der Eingabe nach Reihenfolge!

            // "vor" "nach" binäre(Variabel boolean) Entscheidung zwischen vor und nach
            // gespeichert in
            // variable - wir kümmern uns um vor und nicht vor!
            allesDavor = (sc.next().equals(vor));// ob es vor ist oder nicht (nach = false)
            zeichen = sc.next().charAt(0); // Zeichen einlesen an der Stelle 0 - char, damit java weiß dass wir nur
                                           // einen Zeichen lesen wollen
            sc.next(); // SKIP für IN - irgendein String der "in" sein könnte/sollte - keine Verwendung
            zeichenfolge = sc.next(); // zeichenfolge einlesen
        }
        int i = 0; // Zähler an der Stelle 0, weil von links nach rechts lesen im String (- Index
                   // fängt bei Null bei String hier)
                   
        while (i < zeichenfolge.length()) { // Zähler muss kleiner als gesamtes Eingabewort der Zeichnfolge
            // herausfinden von zeichen in zeichenfolge
            if ((!gefunden || allesDavor) && zeichen == (zeichenfolge.charAt(i))) { // wenn (nicht (gefunden(false)) ist
                                                                                    // (z.14) )also true- wenn es bis
                                                                                    // dahin/diese Überprüfung nicht
                                                                                    // gefunden wurde und...
                // zeichenfolge an der Stelle i/Index gleich das zeichen ist, dann... (es wurde
                // erster Zecihen gefunden)
               
                relevanterTreffer = i + 1; // +1 stelle, ohne +1 index //... dann setzen wir relevanterTreffer aktuelle
                                           // Stelle + 1 (erstes Buchstabe gefunden an Stelle - für keinen weiteren
                                           // neugesetzt/erhöht)
                gefunden = true; // das wird true und wirf uns immer aus if statement raus, weil !true = false
            }
            i++; // Zähler IMMER plus 1, da wir alle Zeichen durchsuchen, doch nach dem ersten
                 // "Fund" relevanterTreffer nicht erhöhen - siehe Lösung zu Break
        }

        if (!gefunden) { // nicht vorhanden - es wurde nix gefunden - kein s in Banane
            return allesDavor ? "" : zeichenfolge; // 1.Option für Vor - wenn das nicht Stimmt die zweite Option (also
                                                   // in dieser binären Aufteilung nach)
        }
        // wurde auf jeden fall was gefunden // Alternative: else{...
        return allesDavor ? zeichenfolge.substring(0, (relevanterTreffer - 1)) // 1. Option für "vor" als true, wenn
                                                                               // nicht dann alles andere (also nach) -
                                                                               // da allesDavor ein boolean ist
                : zeichenfolge.substring(relevanterTreffer, zeichenfolge.length());
    }

}
