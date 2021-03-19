/*
* @author kgolub2s
*/

import java.util.Scanner;

public class GeometrieTest1 {
    public static void test(Scanner sc, String x) { //hier ohen weiteres Argument, warum in Eingabe??
        
       /* Scanner sc = new Scanner(System.in);*/

        
        //double breite = 0;
        //double höhe = 0;
        //keinen Zähler machen, da Scanner laut Aufgabe bis zum Ende der Eingabe lesen soll
        int i = 0;
        while (sc.hasNext()){

            String umfang = sc.next();
            String flaeche = sc.next();
            String falsch = sc.next();
            int breite = sc.nextInt();
            int höhe = sc.nextInt();

            if (falsch.equals(x)){ //String x? richtig oben als Argument oder vohrer deklarieren??

                System.out.println("Falsche Eingabe");
            }

            if (umfang.equals(x)){
                
                System.out.println(Geometrie.umfangREck(höhe, breite));
            }

            if (flaeche.equals(x)){
                
                System.out.println(Geometrie.flaecheREck(höhe, breite));
            }
        }
        i = i + 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}