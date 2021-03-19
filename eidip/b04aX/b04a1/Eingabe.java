/*
  * @author kgolub2s
 */

import java.util.Scanner;
	public class Eingabe {
		public static int zaehlen(Scanner konsolenEingabe, String s){ //Rückgabewert vor Methodenname
				int t = 0;

				while (konsolenEingabe.hasNext()) { // zählt bis zum letzten Wort
				String r = konsolenEingabe.next();

				if (r.equals(s)){
					++t; //= t + 1;	
				}

				
			}
	
				return t;
		}

		public static double durchschnitt (Scanner numbers){
		
			double summe = 0;
			int zähler = 0; 

			while (numbers.hasNextDouble()){
				double geleseneZahl = numbers.nextDouble();
				zähler = zähler + 1; //zähler++;
				summe = summe + geleseneZahl; 

		}
			return summe/zähler;
	}
}	