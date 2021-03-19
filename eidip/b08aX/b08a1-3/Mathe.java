/**
 * @author kgolub2s
 */

// mit John programmiert
public class Mathe {

    public static int addLoop(int a, int b) {
        if (b < 0) {
            b = -b; // -(-b)= b
            return subLoop(a, b);
        }
        while (b > 0) {
            a++;
            b--;
        }
        return a;
    }

    public static int subLoop(int a, int b) {
        if (b < 0) {
            b = -b; // -(-b)= b
            return addLoop(a, b);
        }
        while (b > 0) {
            a--;
            b--;
        }
        return a;
    }

    public static int mulLoop(int a, int b) {
        int gesamt = 0;
        // 7*3
        if (a > 0 & b < 0) { // einfavh "Vertauschen", siehe Z.40
            a = -a;
            b = -b;
        }
        if (a < 0 & b < 0) {
            a = -a;
            b = -b;
        }
        while (b > 0) {
            b--;
            gesamt = addLoop(gesamt, a);
        }
        return gesamt;

    }

    public static int divLoop(int a, int b) {
        int gesamt = 0;
        boolean vorzeichenwechsel = false;
        // 6/ -3
        if (b == 0) {
            throw new IllegalArgumentException("Kein Teilen durch 0 möglich.");
        }
        if (b == 1) { // für Geschwindigkeit- nicht zu merken
            return a;
        }
        if (a < 0) { // als a und b < 0, dann durch beide If-Abfragen
            a = -a;
            vorzeichenwechsel = !vorzeichenwechsel; // true
        }
        if (b < 0) {
            b = -b;
            vorzeichenwechsel = !vorzeichenwechsel;
        }
        while (a >= b) {
            a = subLoop(a, b);
            gesamt++;
        }
        if (vorzeichenwechsel) {
            return -gesamt;
        } else {
            return gesamt;
        }
    }

    public static int modLoop(int a, int b) {
        // 7%3
        boolean vorzeichenwechsel = false;
        // 6/ -3
        if (b == 0) {
            throw new IllegalArgumentException("Kein Teilen durch 0 möglich.");
        }
        if (b == 1) { // für Geschwindigkeit- nicht zu merken
            return a;
        }
        if (a < 0) { // als a und b < 0, dann durch beide If-Abfragen
            a = -a;
            vorzeichenwechsel = !vorzeichenwechsel; // true
        }
        if (b < 0) {
            b = -b;
            vorzeichenwechsel = !vorzeichenwechsel;
        }

        while (b <= a) {
            a = subLoop(a, b);
        }
        if (vorzeichenwechsel) {
            return -a;
        } else {
            return a;
        }
    }

    public static int powLoop(int a, int b) { 
        int ergebnis = 1;
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }
        for (int i = 0; i < b; i++) {
            ergebnis = mulLoop(ergebnis, a);
        }
        return ergebnis;
    }
    

    public static int addRek(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (b < 0) {
                b++;
                a--;
            } else {
                b--;
                a++;
            }
            return addRek(a, b); // geht nicht?
        }
    }

    public static int subRek(int a, int b) {
        // a = 3 b = 2
        if (b == 0) {
            return a;
        } else {
            if (b < 0) {
                b++;
                a++;
            } else {
                b--;
                a--;
            }
            return subRek(a, b);
        }
    }

    public static int mulRek(int a, int b) {
        // erstes Aussortieren
        if (b == 1) {
            return a;
        }
        if (b == -1) {
            return -a;
        }
        if (b == 0) {
            return 0;
        } 
        if (a == 0) {
            return 0;

        } else {
            if (b < 0) {
                b++;
                return subRek(mulRek(a, b), a);
            } else {
                b--;
                return addRek(mulRek(a, b), a);
            }
        }

    }

    public static int divRek(int a, int b) {
        // a = 6 b = 2 ergebnis = 3
        // a = x b = ? ergebnis = x
        if (b == 1) {
            return a;
        }
        if (a >= b) {
            return addRek(divRek(subRek(a, b), b), 1);
        } else {
            return 0;
        }
    }

    // modulo
    public static int modRek(int a, int b) {
        if (b == 1) {
            return 0;
        }
        if (a >= b) {
            return modRek(subRek(a, b), b);
        } else {
            return a;
        }
    }

    // Potenzrechnung
    public static int powRek(int a, int b) {
        if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        } else if (a == 0) {
            if (b == 0) {
                return 1;
            }
        }
        b--;
        return mulRek(powRek(a, b), a);

    }

    public static boolean istPrimLoop(int prime) {
        if (prime == 2) {
            return true;
        }
        if (prime < 2) { 
            return false;
        }
        //double groessterBFteiler = Math.sqrt(prime);
        for (int teiler = 2; teiler*teiler <= prime; teiler++) { 
            //bei Wurzel '=' damit nicht true
            if (prime % teiler == 0) { 
                return false;
            }
        }
        return true;
    }

    public static boolean istPrimRek(int p) {
        return p < 2 ? false : istPrimRek(p, 2);
    }

    private static boolean istPrimRek(int p, int n) {
        if(p == n){ //Abbruchbedingung (bsp 2)
            return true;
        }
        if (p % n == 0){ //Teiler gefunden ohne Rest
            //Primzahl darf nur durch 1 und sich selbst teilbar sein 
                return false; 
        }
        return istPrimRek(p, ++n); //Problem minimieren
    }

    public static int ggT(int a, int b) {
        while (b > 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
