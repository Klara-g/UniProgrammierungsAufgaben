/**
 * @author kgolub2s
 */

public class Zeichenketten {
	public static String grussMitZeit(int stunde, String name) {
		if (stunde < 12) { //vor 12 Uhr
			return "Guten Morgen" + ", " + name + "!";
		}

		if (stunde >= 18) {//ab 18 Uhr
			return "Guten Abend" + ", " + name + "!";
		} else { //12:00-17:59 Uhr
			return "Guten Tag" + ", " + name + "!";

		}
	}

	public static String zitronenEis(int n) {
		String s = "leckeres ";
		int i = 0; // Abbruchbedingung für die Schleife
		while (i < n) { //wie oft super
			s = "super" + s;
			i = i + 1;
		}

		i = 0;
		while (i < n) { //wie oft Z
			s = s + "Z";
			i = i + 1;
		}

		s = s + "Zitroneneis";

		return s;
	}
}
