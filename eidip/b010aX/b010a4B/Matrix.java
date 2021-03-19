
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private double[][] feld;

    public Matrix(int z, int s) {
        feld = new double[z][s];
    }

    public Matrix(int n) {
        this(n, n);
    }

    public Matrix(Matrix m) {
        feld = m.feld;
    }

    public int zeilen() {
        return feld.length;
    }

    public int spalte() {
        return feld[0].length;
    }

    public double get(int z, int s) {
        return feld[z][s];
    }

    public double[][] set(int z, int s, double e) {
        feld[z][s] = e;
        return feld;
    }

    public double[][] setAll(double e) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[0].length; j++) {
                feld[i][j] = e;
            }
        }
        return feld;
    }

    public double[][] setZeile(int z, double[] f) {
        for (int j = 0; j < spalte(); j++) {
            feld[z][j] = f[j];
        }
        return feld;
    }

    public double[][] setSpalte(int s, double[] f) {
        for (int i = 0; i < feld.length; i++) {
            feld[i][s] = f[i];
        }
        return feld;
    }

    public boolean equals(Matrix m) {
        if (zeilen() != m.zeilen() | spalte() != m.spalte()) {
            return false;
        }
        for (int i = 0; i < zeilen(); i++) {
            for (int j = 0; j < spalte(); j++) {
                if (!Mathe.equals(feld[i][j], m.feld[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() { // nicht fertig
        String erg = "[";
        for (int i = 0; i < zeilen() - 1; i++) {
            erg += "[";
            for (int j = 0; j < spalte(); j++) {
                erg += feld[i][j] + ",";
            }
            erg += "],\n";
        }
        for (int i = zeilen() - 1; i < zeilen(); i++) {
            erg += "[";
            for (int j = 0; j < spalte() - 1; j++) {
                erg += feld[i][j] + ",";
            }
            // erg += "]";
        }
        return erg + feld[zeilen() - 1][spalte() - 1] + "]]";
    }

    public double[][] eingabe(java.util.Scanner sc) {
        for (int i = 0; i < zeilen(); i++) {
            for (int j = 0; j < spalte(); j++) {
                feld[i][j] = sc.nextDouble(); // Wirft InputMismatchException wenn Eingabe nicht double
            }
        }
        return feld;
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(3, 2);
        Matrix m2 = new Matrix(new Matrix(2));
        m1.setAll(3);
        m2.setAll(3);
        m1.equals(m2);
        System.out.println(m1.toString());
        System.out.println(Arrays.toString(m1.eingabe(new Scanner(System.in))));
    }
}


