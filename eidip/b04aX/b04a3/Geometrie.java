//Nr. 4 
package b04a3;
// a)
public class Geometrie{
	public static double flaecheREck(double a, double b){
		//if (a < 0) a=-a; //a muss größer als 0 sein ?????
		//if (b < 0) b=-b;
		//return Math.abs(a*b); //gibt absolutwert zurück anhand Java.Math Libary
		return (((a*b)< 0) ? -(a*b) : (a*b));
	}

	public static double umfangREck(double c, double d){
		if (c < 0) c=-c;
		if (d < 0) d=-d;
		return (2 * c + 2 * d);
	}
}