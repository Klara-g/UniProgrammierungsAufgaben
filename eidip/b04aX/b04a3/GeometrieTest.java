/*
  * @author kgolub2s
 */
public class GeometrieTest {
	public static boolean testFlaeche(double a, double b, double erwarteterWert){ //hier MIT Argument
		double ergebnisWert = Geometrie.flaecheREck(a, b);
		boolean istKorrekt = Rundungsfehler.equals(ergebnisWert, erwarteterWert); 
		if (!istKorrekt) {
			System.out.println("false: "+ergebnisWert+" "+erwarteterWert);
		}
		return istKorrekt;
	}

	public static boolean flaecheREckCHeck(){
 		return testFlaeche(0, 0, 0)
			& testFlaeche(2.5, 1, 2.5)
			& testFlaeche(3, 4, 12)
			& testFlaeche(0, 20.6, 0)
			& testFlaeche(20.6, 0, 0)
			& testFlaeche(30, 40, 1200); 
		
			// weitere Möglichkeiten
			} 
			// ggf. Tests weiterer Methoden, z.B. ’absTest()’
  	
	public static boolean testUmfang(double a, double b, double erwarteterWert){ //hier MIT Argument
		double ergebnisWert = Geometrie.umfangREck(a, b);
		boolean istKorrekt = Rundungsfehler.equals(ergebnisWert, erwarteterWert); 
		if (!istKorrekt) {
			System.out.println("false: "+ergebnisWert+" "+erwarteterWert); //
		}
		return istKorrekt;
	}

	public static boolean umfangREckCHeck(){
 		return testUmfang(4, 10, 28)
			& testUmfang(2.5, 1, 7)
			& testUmfang(3, 4, 14)
			& testUmfang(0, 0, 0)
			& testUmfang(0, 20.6, 41.2)
			& testUmfang(20.6, 0, 41.2);
			
			
			} 
  	public static boolean test() { //Aufgabenstellung: OHNE Argumente
    	
    	return flaecheREckCHeck()&umfangREckCHeck(); //ich gebe kombiniterten Rückgabewert von beiden 
    	//Funktionen zurück
    	
       /* andere Testfunktionen, die ich aufrufen möchte*/

	}
	public static void main(String[] args){
		if (test()){
			System.out.println("OK");
		}

	}
}
//Have a nice day :)

