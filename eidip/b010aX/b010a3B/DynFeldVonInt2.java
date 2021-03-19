public class DynFeldVonInt2 {
    private int[] feld;
    private int laenge; // Instanzvariablen

    public DynFeldVonInt2(int zahl) {
        this.laenge = zahl;
        this.feld = new int[zahl];
    }

    public int length(int[] feld) {
        return this.laenge;
    }

    public int get(int i) {
        return this.feld[i];
    }

    public void set(int i, int v) {
        this.feld[i] = v;

    }
    public void insert(int i, int k)throws IllegalArgumentException{
        if(k < 0){
            throw new IllegalArgumentException("unerlaubt");
        }else{
            this.feld = new int[];
        }
        // Null bis i übernehmen
        // k mal Nullen dazwischen setzten 
        //Werte kopiert und an position i kopiert
        //altes Array wird ersetzt
        
        for (int index = 0; f.length > index; index++) {
            //tmp = f.length - index; //richitge Position
            umgekehrt[f.length-index-1] = f[index]; //auslöser des index-1 ist bei Möglichkeit 0
        }
     


    }
}
