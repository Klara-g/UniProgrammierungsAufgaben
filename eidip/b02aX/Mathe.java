/**
 * @author kgolub2s
 */

public class Mathe {

	// Absolutbetrag
	public static int abs(int n) {
		if (n < 0) {
			return -n;
		} else {
			return n;
		}
	}

	// größter Wert wird zurückgegeben
	public static int max3(int a, int b, int c) {
		if (a >= c) {
			if (a >= b) {
				return a;
			}
		}

		if (b >= c) {
			if (b >= a) {
				return b;
			}
		}

		return c;
	}
	/*Quadratzahlen in absteigender Reihenfolge 
	16 
	9 
	4
	1
	*/
	public static void quadOutRueck(int n) {
		while (n > 0) {
			System.out.println(n * n);
			n = n - 1;
		}
	}
//Fakultät zurückgeben: Rekursiv
	public static int fak(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fak(n - 1);

		}
	}
	//Überprüfen, ob es richtig ist 
	public static int fakLoop(int n){
		int ergebnis = 1;
		for(int i = 0; (i < n) ; i++){
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}

	//klappt nicht:
	public static void main(String[] args){

		System.out.println(Mathe.abs(39));
		System.out.println(Mathe.abs(-5));
		System.out.println(Mathe.max3(3, -5, 10));
		System.out.println(Mathe.max3(-5, 0, -4));
		Mathe.quadOutRueck(4);
		Mathe.quadOutRueck(2);
		System.out.println(Mathe.fak(39));
		System.out.println(Mathe.fak(4));

	}
}