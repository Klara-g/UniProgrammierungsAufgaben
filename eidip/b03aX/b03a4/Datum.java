/*
* @author kgolub2s
*/

/* nur mittels if-else
	nur mittels logischer Operatoren (knifflig!)
	als Mischform
*/
public class Datum {
	public static boolean istSchaltjahr(int a) {

		if (1582 >= a) { // Julianischer Kalender

			if (a % 4 == 0) {

				return true;

			}

		}

		if (1583 < a) { // Gregorianischer Kalender

			if (a % 4 == 0) {

				if (a % 100 != 0) {

					return true;
				}

				if (a % 100 == 0 & a % 400 == 0) {

					return true;

				}
			}
		}

		else {

			return false;

		}

		return false;
	}

}