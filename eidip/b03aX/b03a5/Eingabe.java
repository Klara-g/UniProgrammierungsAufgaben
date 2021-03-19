import java.util.Scanner;
	public class Eingabe {
		public static int zaehlen(String s, Scanner sc){ //Rückgabewert vor Methodenname; in Klammern das benutze Argument
				int t = 0;

				while (sc.hasNext()) { // Gibt es noch ein nächstes Wort? zählt bis zum letzten Wort
				String wort = sc.next(); //bis zum nächstes Leerzeichen

				if (wort.equals(s)){
					++t; //= t + 1;	
				}

				
			}
				return t;
		}
		//ungültige eingabe für s = affe affe (mit Leerzeichen)


		public static void main(String[] args){
			Scanner sc = new Scanner (System.in);
			System.out.println (zaehlen("und", sc));
		}

	}