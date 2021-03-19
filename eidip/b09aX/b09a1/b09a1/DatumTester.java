package b09a1;

import java.text.SimpleDateFormat;

public class DatumTester {
    public static void main(String[] args){
        Datum d4 = new Datum(1957, 10, 4);
        Datum d5 = new Datum(2017, 6, 28);
        String giraffe = "giraffe";
        Datum.setFormatRF(null);
        System.out.println(Datum.tageInMonat(6, 4));
        System.out.println(Datum.tageInMonat(4, 4));
        //System.out.println(d4));
        throw new IllegalArgumentException("ungueltiger Wert fuer Format-Reihenfolge: \"" + giraffe + "\"");
    }
    
}
