public class Rundungsfehler{
	public static boolean equals(double x, double y){
		double eps = 0.000001;
			return (x == y ||
		
			(x == 0 ? Math.abs(y) :
			y == 0 ? Math.abs(x) :
			Math.abs(x-y) / 
			Math.min(Math.abs(x),Math.abs(y))) < eps);
	}
}