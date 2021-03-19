/*
* @author kgolub2s
*/
package b04a5.daten2;
public class Datum {
	public static boolean istSchaltjahr(int a) {

		if (1582 > a) {

			if (a % 4 == 0) {
				
				return true;

			}

		}

		if (1583 < a) {

			if (a % 25 == 0) {

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