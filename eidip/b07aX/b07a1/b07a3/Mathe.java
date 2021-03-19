package b07a3;
public class Mathe{
    public static int ggTalt(int a, int b) {
        while (b > 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    
    public static int ggT(int a, int b) {
        int temp = 0;
        while (b > 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static boolean equals(double x, double y) {
            double eps = 0.000001;
            return (x == y || (x == 0 ? Math.abs(y)
                    : y == 0 ? Math.abs(x) : Math.abs(x - y) / Math.min(Math.abs(x), Math.abs(y))) < eps);
        }
    

}
