/**
 * nicht meine Lösung - nur zur Demonstration 
 */
public class ZeichenketteTest {

    public static boolean verkuerzeCheck(String s, int n, String erw) {
        String erg = Zeichenkette.verkuerze(s, n);
        boolean istKorrekt = erg.equals(erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: verkuerze(" + s + "," + n + ")==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean test() {
        /*
         * Bei && werden sobald ein Test fehlschlägt, die restlichen Teile des
         * Ausdrucks nicht mehr behandelt. Oft ist es sinnvoll, wenn man möchte, dass
         * bestimmte Operationen nicht ausgeführt werden oder um effizienter zu sein. In
         * diesem Fall macht es aber durchaus Sinn, da wir ja alle Fehler ausgegeben
         * haben wollen und nicht nur den ersten.
         */
        return verkuerzeCheck("bla", 8, "bla") 
                && verkuerzeCheck("Abrakadabra", 3, "Abrakadabra") 
                && verkuerzeCheck("Abrakadabra", 0, "[...]")
                && verkuerzeCheck("hallo", 0, "hallo")
                && verkuerzeCheck("", 0, "");

    }
}
