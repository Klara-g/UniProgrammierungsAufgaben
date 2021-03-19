/*
  * @author kgolub2s
 */
import java.util.Scanner;
public class Messdaten1{
	public static double temperaturInDurschnitt(Scanner datenEingabeTem){ //Name ändern
		
		String w = "Temperatur"; 
		int summe = 0;
		int zähler = 0;
		int minTem = -273,15;

		while (sc.hasNext){
			int j = datenEingabeTem.next(); //Jahr
			int m = datenEingabeTem.nextInt();//Monat
			int d = datenEingabeTem.nextInt();//Tag
			String messwert = datenEingabeTem.next();
			double celsius = datenEingabeTem.nextDouble();

			if (messwert.equals("Temperatur")){
				Summe = Summe + celsius;
				Zähler = Zähler + 1; 
			}
		
				

			if (celsius > minTem) {
				celsius = minTem;
			}

			System.out.println("hoechste Temperatur c am d.m.j)
		

			return summe/zähler; 
		}
	}

	public static void main (String[] args){
		Scanner datenEingabeTem = new Scanner(System.in);
		System.out.println(Messdaten.temperaturInDurschnitt);
		System.out.println(Messdaten.temperaturInDurschnitt);
		System.out.println(Messdaten.temperaturInDurschnitt);
	}
}