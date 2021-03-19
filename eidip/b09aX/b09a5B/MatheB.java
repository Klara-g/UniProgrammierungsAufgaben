/**
 * @author kgolub2s
 */
//mit John Meyerhoff gemacht :)
public class Mathe {
    public static int powLoop(int a, int b) { // Anscheinend falsch
        int ergebnis = 1;
        
        for (int i = 0; i < b; i++) {
            ergebnis = ergebnis * a;
        }
        return ergebnis;

    }
    public static double pi1(int n) throws IllegalArgumentException{
 //zweiter Hinweis wichitg, ich habe den nicht verstanden
        double oberhalb = 1;
        int k = 0;
        
        double ergebnis = 0;

        if(n>=0){
        while(k <= n){ //i wäre es ein k 
            oberhalb = powLoop(-1, k);
            ergebnis += oberhalb / ((2 * k) + 1);
            k++;
        }
    return ergebnis*4;
    
    }else{
        throw new IllegalArgumentException("ungültiger Wert");
    }
    }
    public static double pi2(){ //was soll eps sein?
        return pi2(0.00000001);

    }
    public static double pi2(double eps) throws IllegalArgumentException{
 //zweiter Hinweis wichitg, ich habe den nicht verstanden
        double oberhalb = 1;
        int k = 0;
        
        double ergebnis = 0;
        double summand = 2;
        if(eps > 0 && eps < 1){
        while(summand > eps && summand > 0 || summand < 0 && -summand > eps){ //i wäre es ein k 
            oberhalb = powLoop(-1, k);
            summand = oberhalb / ((2 * k) + 1);
        
            ergebnis += summand ;
            k++;
    }
    return ergebnis * 4;
    }else{
        throw new IllegalArgumentException("ungültiger Wert");
    }
}

    public static double pi3() { // was soll eps sein?
        return pi3(0.00000001);

    }
    public static double pi3(double eps){
        double oberhalb = 1;
        int k = 0;

        double ergebnis = 0;
        double summand = 2;
        if (eps > 0 && eps < 1) {
            while (piAbweichung(ergebnis)> eps) { // i wäre es ein k
                oberhalb = powLoop(-1, k);
                summand = oberhalb / ((2 * k) + 1);

                ergebnis += summand;
                k++;
            }
            return ergebnis * 4;
        } else {
            throw new IllegalArgumentException("ungültiger Wert");
        }
    }
    public static double piAbweichung(double piViertel){
        double a = (piViertel * 4) - Math.PI;
        return (a > 0) ? a : -a;
    }
}