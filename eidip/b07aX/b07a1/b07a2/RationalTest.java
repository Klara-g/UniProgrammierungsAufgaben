package b07a2;
public class RationalTest {
    public static void main(String[] args) {
    Rational neu = new Rational();
    Rational eins = new Rational(4);
    Rational zwei = new Rational(1, 3);
    Rational drei = new Rational(2, 3);  
    Rational vier = new Rational(6, 3);
    Object abc = new Object();
    abc.equals(abc);
    Rational fuenf = new Rational(5, 3);     
    Rational six = new Rational(3, 6);
    Rational.parse("-23/45");
    //System.out.println("eins.toString: " + eins.toString());
    //System.out.println("zwei.istKleiner(drei): " + zwei.istKleiner(drei));
    //System.out.println("vier.istKleiner(fuenf): " + vier.istKleiner(fuenf));
    //System.out.println("vier.istKleiner(six): " + vier.istKleiner(six));
    //System.out.println("fuenf.istKleiner(fuenf): " + fuenf.istKleiner(fuenf));
    //System.out.println("vier.toString: " + vier.toString());
    //System.out.println("Mathe.ggT(6, -3): " + Mathe.ggT(6, -3)); //es gibt keinen ggT von -zahl und zahl
    //System.out.println("Mathe.ggT(16, 24): " + Mathe.ggT(16, 24));
    //System.out.println("zwei.zaehler:" + eins.zaehler());
    //System.out.println("neu.rez: " + zwei.rez());
    //System.out.println("vier.abs: " + vier.abs());
    System.out.println(neu.toString());
    //System.out.println("neu.add: " + drei.add(vier));
    //System.out.println("vier.div: " + vier.div(zwei)); //korrekt
    //System.out.println("vier.sub: " + zwei.sub(zwei)); //korrekt

}
}


