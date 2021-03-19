package b09a4;
import java.util.Scanner;

public class RationalAusdruck {
    public static Rational auswertung(Rational a, char op, Rational b)
            throws IllegalArgumentException, ArithmeticException {

        if (op == '*') {
            return a.mul(b);
        }
        if (op == '+') {
            return a.add(b);
        }
        if (op == '-') {
            return a.sub(b);
        }
        if (op == '/') {
            if (b.nenner() == 0) {
                throw new ArithmeticException("ungültiger Wert");
            }
            if (b.zaehler() == 0) {
                throw new ArithmeticException("ungültiger Wert");
            }
            return a.div(b);

        } else {
            throw new IllegalArgumentException("ungültiger Wert");
        }

    }

    public static void next(Scanner sc) throws java.util.InputMismatchException{
        try{
        String ersterTeil = Rational.parse(sc.next());
        String op = sc.next();
        String zweiterTeil = Rational.parse(sc.next());

        if (op.length() != 1) { 
            throw new java.util.InputMismatchException("ungueltiger Operator '" + op + "'.");
            }
        return auswertung(a, oper.charAt(0), b);
        
    }catch(Exception e){
            throw new java.util.InputMismatchException("ungültige Eingabe");
        }
        //ArithmeticExceptions werden im Konstruktor von Rational geworfen
    }      
    //dialog-Methode fehlt

    public static void main(String[] args) {
        Rational a = new Rational(1, 0);
        Rational b = new Rational(1, 2);
        Rational c = new Rational(1, 1);
        Rational d = new Rational(0, 2);
        char geteilt = ':';
        System.out.println(auswertung(c, geteilt, d));
    }
}
