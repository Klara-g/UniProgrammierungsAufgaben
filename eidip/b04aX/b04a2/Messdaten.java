/*
  * @author kgolub2s
 */
import java.util.Scanner;
public class Messdaten{
	public static double temperaturInDurchschnitt(Scanner datenEingabeTem){ //Name ändern
		
		 
		double summe = 0;
		int zaehler = 0;
		double maxTemp = -273.15;

		int maxTempJ = 0;
		int maxTempM = 0;
		int maxTempD = 0;
	

		while (datenEingabeTem.hasNext()){
			int j = datenEingabeTem.nextInt(); //Jahr
			int m = datenEingabeTem.nextInt();//Monat
			int d = datenEingabeTem.nextInt();//Tag
			String messwert = datenEingabeTem.next();
			double celsius = datenEingabeTem.nextDouble();

			if (messwert.equals("Temperatur")){
				summe = summe + celsius; //summe += celsius
				//zaehler = zaehler + 1; 
				++zaehler;
				

			if (celsius >= maxTemp) {
				maxTemp = celsius;

				maxTempJ = j;
				maxTempM = m;
				maxTempD = d;
		}

		}

	}

			System.out.println("hoechste Temperatur (" + maxTemp + ") am " + maxTempD + "." + maxTempM + "." +maxTempJ);


		

			return summe/zaehler;		
		
	}
}