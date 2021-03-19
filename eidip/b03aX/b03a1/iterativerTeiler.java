public class iterativerTeiler {
	public static int ggTAdd(int a, int b) {

		if (a == 0) {

			return b;
		}

		while (b > 0) {

			if (a > b) {
				a = a - b;

			}

			if (b >= a) {
				b = b - a;
			}

		}

		return a;

	}

	public static int ggTMul(int a, int b) {

		while (b > 0) {
			int t = a % b;
			a = b;
			b = t;
		}

		return a;

	}
}
