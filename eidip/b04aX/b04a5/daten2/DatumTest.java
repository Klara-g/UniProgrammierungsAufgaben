/*
  * @author kgolub2s
 */
package b04a5.daten2;
import b04a5.daten2.Datum; //zwei verschiedene Verzeichnisse, daher importieren
public class DatumTest {
	public static boolean testDatum(int a, boolean erwarteterWert) {
	 	boolean ergebnisDatum = Datum.istSchaltjahr(a); //
		boolean istKorrekt = (ergebnisDatum == erwarteterWert); 
		if (!istKorrekt) {
			System.out.println("false: "+a+" "+ergebnisDatum+" "+erwarteterWert); //war nicht vorgegeben von Aufgabenstellung
		
		}
		
		return istKorrekt;
	}
	
	public static boolean istSchaltjahr(){
		
  		return testDatum(2000, true)
			& testDatum(1500, true)
			& testDatum(0, true)
			& testDatum(1, false)
			& testDatum(12, true)
			& testDatum(100, true)
			& testDatum(400, true) //durch 100, durch 4, vor 1982
			& testDatum(1600, true)
			& testDatum(1604, true)
			& testDatum(2131, false)
			& testDatum(1583, false)
			& testDatum(1582, false)
			& testDatum(1800, false)
			& testDatum(1900, false) //:100, nach 1982, obwohl durch 4 teilbar - nicht schlatjahr
			& testDatum(1582, false)
			& testDatum(1583, false)
			& testDatum(1584, true)
			& testDatum(2100, false)
			& testDatum(2104, true)
			& testDatum(1400, true)
			& testDatum(2131, false)
			& testDatum(2250, false)
			& testDatum(2400, true);

		}
// ggf. Tests weiterer Methoden, z.B. ’absTest()’
  
  	public static boolean test() {
    		
    		return istSchaltjahr();
       /*& absTest()*/	
	}
	public static void main(String[] args){
		if (test()){
			System.out.println("OK");
		}else{
			System.out.println("Fehler");
		}

	}
  	
}
//Have a nice day :)