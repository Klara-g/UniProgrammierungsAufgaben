package b09a3;
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
}
