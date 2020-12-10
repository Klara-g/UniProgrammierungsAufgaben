
/**
 * @author jmeyer2s
 */
import java.util.Scanner;

public class Interpreter {
  public static String verarbeite(Scanner sc) {
    String vor = "vor";
    boolean ausgabeVorZeichenGewollt = true;
    char zeichen = '0';
    String zeichenfolge = "";
    int gefundenBei = -8; // -8 ist der fixwert für "nicht gefunden"
    while (sc.hasNext()) {
// Position Zeichen in Zeichenfolge
// "vor" "nach" binäre Entscheidung zwischen vor und nach gespeichert in variable
      ausgabeVorZeichenGewollt = (sc.next().equals(vor));
      zeichen = sc.next().charAt(0);
      sc.next(); // SKIP
      zeichenfolge = sc.next();
    }
    for (int i = 0; i < zeichenfolge.length(); i++) {// Position
//herausfinden von zeichen in zeichenfolge
      if (zeichen == (zeichenfolge.charAt(i)) && gefundenBei == -8) {
        gefundenBei = i + 1; // +1 stelle, ohne +1 index
      }
    }
    if (gefundenBei == -8) { // nicht vorhanden
      return ausgabeVorZeichenGewollt ? "" : zeichenfolge;
    }
    return ausgabeVorZeichenGewollt ? zeichenfolge.substring(0, (gefundenBei - 1))
        : zeichenfolge.substring(gefundenBei, zeichenfolge.length());
  }

}
