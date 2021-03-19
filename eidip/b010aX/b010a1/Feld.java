
import java.util.Arrays; 

/**
 * @author kgolub2s
 */
public class Feld {
    public static boolean istHomogen(int[] f) throws NullPointerException, IllegalArgumentException {
        if (f == null) {
            throw new NullPointerException("Wert ist null");
        }
        if (f.length < 0) { // sollte nicht möglich sein, da Länge ein Absolutwert ist
            throw new IllegalArgumentException("ungültiger Wert");
        }
        if (f.length == 0) {
            return true;
        }
        int anfang = f[0]; 
        for (int i = 0; (i < f.length); i++) {

            if (anfang == f[i]) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean istSortiert(int[] f) {
        // Aufgabe: aufsteigende Reihenfolge: true/false?
        if (f == null) { //eine Referenz ins nichts
            throw new NullPointerException("Wert ist null");
        }
        if (f.length < 0) { // sollte nicht möglich sein, da Länge ein Absolutwert ist
            throw new IllegalArgumentException("ungültiger Wert");
        }
        if (f.length == 0) {
            return true;
        }
        for (int i = 0; (f.length > (i + 1)); i++) {
            if (f[i] > f[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int maxPos(int[] f) {
        // Position mit dem größten Element von f
        if (f == null) {
            throw new NullPointerException("Wert ist null");
        }
        if (f.length <= 0) {
            throw new IllegalArgumentException("ungültiger Wert");
        }
        int max = 0;// max speichert index mit höchsten Wert
        for (int i = 0; f.length > i; i++) {
            if (f[max] < f[i]) {
                max = i; //max wird neu zugewiesen 
            }
        }
        return max + 1; // Index zu Position kovertiert
    }

    public static int maxElement(int[] f) {
        if (f == null) {
            throw new NullPointerException("Wert ist null");
        }
        if (f.length == 0) {
            throw new IllegalArgumentException("ungültiger Wert");
        }
        int maxElement = f[0]; // Position 0, wegen - Zahlen (wir dürfen 0 nicht angeben!)
        if (f.length < 2) {
            return f[0];
        }
        for (int i = 1; (f.length > i); i++) { // länger als höchste Stelle?
            // starten bei 1, da maxElement bei f[0]
            if (maxElement < f[i]) {
                maxElement = f[i];
            }
        }
        return maxElement;
    }
    
    public static int maxElementKurz(int[] f) {
        return f[maxPos(f)-1];
    }

    public static int[] max(int[] f1, int[] f2) throws IllegalArgumentException {
        //2 Felder, pro Position größten Wert in neues Feld
        if (f1.length < f2.length || f2.length < f1.length) {
            throw new IllegalArgumentException("Längen sind ungleich");
        }
        if (f1 == null | f2 == null) {
            throw new NullPointerException("Wert ist null");
        }
        if (f1.length < 0 | f2.length < 0) {
            throw new IllegalArgumentException("ungültiger Wert");
        } else {
            int[] ergbenis = new int[f1.length];
            for (int i = 0; i < f1.length; i++) {
                // ergbenis[i] = f1[i] > f2[i] ? f1[i] : f2[i];
                if (f1[i] > f2[i]) {
                    ergbenis[i] = f1[i];
                } else {
                    ergbenis[i] = f2[i];
                }
            }
            return ergbenis;
        }
    }

    public static int[] umkehren(int[] f) {
        int[] umgekehrt = new int[f.length];
       
        for (int index = 0; f.length > index; index++) {
            umgekehrt[f.length - index - 1] = f[index]; // auslöser des index-1 ist bei Möglichkeit 0
        }
        //System.out.println("Umgekehrt: " + Arrays.toString(umgekehrt));
        //System.out.println("Eingabe:   " + Arrays.toString(f));

        return umgekehrt;

    }
    
    public static void swap(int[] f, int a, int b) {
        int tmp = f[a];
        f[a] = f[b];
        f[b] = tmp;
    }

    public static void umkehrenInPlace2(int[] f) {
        //ohne neues Feld, umkehren im gleichen Feld
        for (int i = 0; i * 2 < f.length; i++) {
        swap(f, i, f.length - 1 - i);
        }
    }

    public static void umkehrenInPlace(int [] f){
       
        int tmp = 0; //temporär Zwischenspeicher 
        for (int index = 0; f.length > (index + index); index++) { //nur bis zu Hälfte, sosnt wie Anfang
            tmp = f[f.length - 1 - index]; 
            f[f.length - 1 - index] = f[index]; 
            f[index] = tmp;
            //System.out.println(tmp);
        }
    }
    public static void main(String[] args) {
        int[] u = { 1, 5, 3, 2 };
        int[] g = { 0, 0, 0 };
        int[] h = { 1, 2, 3, 4, 5, 6 };
        int[] w = { 3, 4, 5 };
        int[] s = { 16, 17, 15 };
        int[] c = { -12, -8, -3 };
        int[] f = { 3 };
        int[] i = { 10, 50, 30, 40, 20 };
        // System.out.println(max(f,g));
        // System.out.println(max(g, h)[2]);
        System.out.println(maxPos(g));
        System.out.println(g);

        // System.out.println(maxPos(i));
        // System.out.println(Arrays.toString(umkehren(w)));
        // System.out.println(umkehren(h));
        // umkehrenInPlace(w);
        // umkehrenInPlace(h);
        /*
         * System.out.println(maxElement(g)); System.out.println(maxElement(w));
         * System.out.println(maxElement(s)); System.out.println(maxElement(c));
         * System.out.println(maxElement(f));
         */

    }

}
