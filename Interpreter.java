
import java.util.Scanner;

public class Interpreter {
    public static String verarbeite(Scanncer sc){

        while (sc.hasNext()){

            String position = sc.next();
            String vor = sc.next();
            String nach = sc.next();

            String zeichen = sc.next();
            
            String in = sc.next();

            String zeichenfolge = sc.next();

            char diesePosition = zeichenfolge.charAt(i); //PROBLEM!!!!!- wo ist i? Digit von zeichen herausfinden!
            char ende = position.length();

            char vorne = zeichenfolge.substring(0, diesePosition);
            char hinter = zeichenfolge.substring(diesePosition, ende); 

            if (position.length() == nach.length()){
                return hinten; 
            } 
            if (position.length()==nach.length()& zeichenfolge.length() != zeichen.length()){
                return zeichenkette;
            }
            if (position.length()== vor.length()){
                return vorne; 
            }else (position.length()== vor.length() & zeichenfolge.length() == zeichen.length()) {
                return whitespace;
            }
        }
    }

    public static String verarbeite(Scanncer sc, String s){

        while (sc.hasNext()){

            String position = sc.next();
            String vor = sc.next();
            String nach = sc.next();

            String zeichen = sc.next(); //
            
            String in = sc.next();

            String zeichenfolge = sc.next();

            char diesePosition = zeichenposition.charAt(i); //PROBLEM!!!!!- wo ist i? Digit von zeichen herausfinden!
            char ende = position.lenght()-1;

            char vorne = zeichenfolge.substring(0, diesePosition);
            char hinter = zeichenfolge.substring(diesePosition, ende); 

            if (position.length() == nach.lenght()){
                return hinten; 
            } 
            if (position.length()==nach.length()& zeichenfolge.length() != zeichen.length()){
                return zeichenkette;
            }
            if (position.length()== vor.length()){
                return vorne; 
            }else (position.length()== vor.length() & zeichenfolge.length() == zeichen.length()) {
                return whitespace;
            }
        }
    }
}
