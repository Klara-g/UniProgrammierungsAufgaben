public class DynFeldVonInt {

    private int[] speicher;

    public DynFeldVonInt(int laenge) throws IllegalArgumentException {
        if (laenge < 0) {
            throw new IllegalArgumentException("kleiner als 0: laenge = " + laenge);
        }
        this.speicher = new int[laenge];
    }

    public int length() { // für Außenzugriff auf Länge - read only
        return this.speicher.length;
    }

    public int get(int position) throws IllegalArgumentException {
        if (position < 1) {
            throw new IllegalArgumentException("Der Position darf nicht kleiner als 1 sein!");
        }
        return this.speicher[position - 1];
    }

    public void set(int position, int value) throws IllegalArgumentException {
        if (position < 1) {
            throw new IllegalArgumentException("Der Position darf nicht kleiner als 1 sein!");
        }
        this.speicher[position - 1] = value;
    }

    public void insert(int position, int nullstellen) throws IllegalArgumentException {
        if (nullstellen < 0) {
            throw new IllegalArgumentException("kleiner als 0: nullstellen = " + nullstellen);
        }
        if (position < 1) {
            throw new IllegalArgumentException("Die Position darf nicht kleiner als 1 sein!");
        }
        int[] erweitert = new int[this.length() + nullstellen];
        for (int i = 0; i < erweitert.length; i++) {
            if (i < position) { //vor Position
                erweitert[i] = this.speicher[i]; //keine Ergänzung, nur Übertragung
            } else {
                erweitert[i] = (i >= position + nullstellen) ? this.speicher[i - nullstellen] : 0;
                //1. erste Position nach Nullstellen 
                //2. 0 ergänzen
            }
        }
        this.speicher = erweitert; //erweitert ist Referenz, hie wird Referenz zugewiesen
    }

    public void remove(int i, int k) throws IllegalArgumentException {
        if (k < 0 | k > this.speicher.length) {
            throw new IllegalArgumentException("kleiner als 0: k = " + k);
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Der index darft nicht kleiner als 0 sein!");
        }
        int[] f = new int[speicher.length - k];
        for (int j = 0; j < i; j++) {
            f[j] = this.speicher[j];
        }
        for (int j = i + k; j < this.speicher.length; j++) {
            f[j - k] = this.speicher[j];
        }
        this.speicher = f;
    }

    public boolean equals(DynFeldVonInt f) {
        return java.util.Arrays.equals(f.speicher, this.speicher);
        /*
         * for (int i = 0; i < this.speicher.length; i++) { if(f.speicher[i] !=
         * this.speicher[i]){ return false; } } return true;
         */
    }

    public String toString() {
        if (speicher.length == 0) {
            return "[]";
        }
        String out = "[" + this.speicher[0];
        for (int i = 1; i < this.speicher.length; i++) {
            out += "," + this.speicher[i];
        }
        return out + "]";
    }

    public static void main(String[] args) {
        DynFeldVonInt f = new DynFeldVonInt(20);
        for (int i = 1; i < f.length(); i++) {
            f.set(i, i);
        }
        f.insert(5, 5);
        for (int i = 1; i < f.length(); i++) {
            System.out.println(f.get(i));
        }
        System.out.println(f.toString());

    }

}
