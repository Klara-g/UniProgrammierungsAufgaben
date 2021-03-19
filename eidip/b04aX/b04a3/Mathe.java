/**
  * @author kgolub2s
 */

public class Mathe{
	public static int abs(int n) {
		if (n<0) {
			return -n;} 
			return n;
	}

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
		
		
	public static void quadOutRueck(int n) {
		while (n > 0) {
			System.out.println(n*n);
			n = n - 1;
		}
	}

	public static int fak(int n){
		if (n == 0) {
			return 1;
		}
		else {
			return n * fak(n - 1);

		} 
	}


	public static int ggTAdd(int a, int b){
		
		if  (a == 0) {
			
			return b;
		}

		while (b > 0) {
			
			if (a > b) {
				a = a - b;

					}

			if (b >= a) {
				b= b - a;
			}
			
	
		}
		
			return a;

			
			}
			
	
	public static int ggTMul(int a, int b) {

		
		while ( b > 0){
			int t = a % b;
			a  = b;
			b = t;
		 }
		 return a; 
		 
					
  }
  	public static int ggT(int a, int b){
		  
		  if(a<0){
			  return a*(-1);
			  }
			if(b<0){
				return b*(-1);
			}
			return Mathe.ggTMul(a, b);
	  }

	  //Nr. 2 AB 3
	  //a*1 bis a*n
	public static void ausgabeVielfache (int a, int n){
			int t = 0;  

			while (n > t) { 
	
			t = t + 1;
				
				System.out.print (a * t + " "); //Leerzeichen
				
			} 
		
		System.out.println (""); //Zeilenumbruch
 	    }
 		
	 //Ablauf besprechen :)

	public static void ausgabe1x1 (int n) {
		int a = 0;
		while (a < n) { 
			a = a + 1; 
			ausgabeVielfache(a, n);
			
		
		}
		
	} 
}
