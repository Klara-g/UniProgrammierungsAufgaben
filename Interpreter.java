
/**
 * @author kgolub2s
 */
import java.util.Scanner;

public class Interpreter {
    public static String verarbeite(Scanner sc) {
        // Position Zeichen in Zeichenfolge
        String vor = "vor";  //als SchlüsselWort vorgegeben
        boolean allesDavor = true; //wir kümmern uns um die Möglichkeit "vor" der Positionseingabe
        char zeichen = '0'; // char immer genau 1 zeichen, und hier zum späteren "überschreiben"/initialisieren - keine Bedeutung
        String zeichenfolge = ""; //auch zum Überschreiben
        int ersterTreffer = 0; //zum überschreiben, die Stelle des erste Buchstaben (int) der dem Zeichen der Eingabe entspricht  
        boolean gefunden = false; // false ist der fixwert für "nicht gefunden" - bis dato nichts gelesen - also nix gefunden
        
        while (sc.hasNext()) { //ab hier Einlesen der Eingabe nach Reihenfolge!
            
            // "vor" "nach" binäre(Variabel boolean) Entscheidung zwischen vor und nach gespeichert in
            // variable - wir kümmern uns um vor und nicht vor!
            allesDavor = (sc.next().equals(vor));//ob es vor ist oder nicht (nach = false)
            zeichen = sc.next().charAt(0); //Buchstabe einlesen an der Stelle 0 - char, damit java weiß dass wir nur einen Buchstaben lesen wollen
            sc.next(); // SKIP für IN - irgendein String der "in" sein könnte/sollte - keine Verwendung
            zeichenfolge = sc.next();  //zeichenfolge einlesen
        }
        
        int i = 0; //Zähler an der Stelle 0, weil von links nach rechts lesen im String (- Index fängt bei Null bei String hier)
        
        while (i < zeichenfolge.length()) { //Zähler muss kleiner als gesamtes Eingabewort der Zeichnfolge
            // herausfinden von zeichen in zeichenfolge
            if (!gefunden && zeichen == (zeichenfolge.charAt(i))) { //wenn (nicht (gefunden(false)) ist (z.14) )also true- wenn es bis dahin/diese Überprüfung nicht gefunden wurde und...
                // zeichenfolge an der Stelle i/Index gleich das zeichen ist, dann... (es wurde erster Zecihen gefunden)
                ersterTreffer = i + 1; // +1 stelle, ohne +1 index //... dann setzen wir ersterTreffer aktuelle Stelle + 1 (erstes Buchstabe gefunden an Stelle - für keinen weiteren neugesetzt/erhöht)
                gefunden = true; // das wird true und wirf uns immer aus if statement raus, weil !true = false
            }
            i++; //Zähler IMMER plus 1, da wir alle Zeichen durchsuchen, doch nach dem ersten "Fund" ersterTreffer nicht erhöhen - siehe Lösung zu Break
        }
       
        if (!gefunden) { // nicht vorhanden - es wurde nix gefunden - kein s in Banane
            return allesDavor ? "" : zeichenfolge; // 1.Option für Vor - wenn das nicht Stimmt die zweite Option (also in dieser binären Aufteilung nach)
        } 
        // wurde auf jeden fall was gefunden // Alternative: else{...
        return allesDavor ? zeichenfolge.substring(0, (ersterTreffer - 1)) // 1. Option für "vor" als true, wenn nicht dann alles andere (also nach) - da allesDavor ein boolean ist
                : zeichenfolge.substring(ersterTreffer, zeichenfolge.length()); 
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ergebnis = verarbeite(sc);
        System.out.println(ergebnis);
    }
}
