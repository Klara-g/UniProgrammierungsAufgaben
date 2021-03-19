
/**
 * @author kgolub2s
 */
import java.io.PrintStream;
import java.util.Scanner;
public class Eingabe { 
    public static int filter(Scanner sc, PrintStream ps, String start, String stop, String skip) {
   
    //Beispiel: 
    // eins zwei start egal egal stop drei
    // felix anton alex felix felix gustav martin
    // felix anton alex felix felix alex martin
        int summe = 0;
        String naechstesZeichen = ""; //nächste Zeichenkette
    
        while (sc.hasNext()) {
            naechstesZeichen = sc.next(); // "ohne" Whitespaces
            if (naechstesZeichen.equals(start)) {
                while (!(naechstesZeichen.equals(stop))&& sc.hasNext()) { // es gibt ein nächstes Zeichen
                    naechstesZeichen = sc.next();
                }
            }
            else if (naechstesZeichen.equals(skip)) {
                sc.nextLine();

            } else {
                ps.print(naechstesZeichen + " ");
                summe = summe + 1; 
            }
        }
        
        ps.append("\n"); // Zeilenumbruch 
        return summe;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int a = 2; int b= 7; int c = a++; //a + 1 int d = ++b - a++; //5
         * System.out.println("a: " + a + "b: " + b + "c: " + c + "d: " + d);
         */
        PrintStream pc = new PrintStream(System.out);
        int ergebnis = filter(sc, pc, "/*", "*/", "//");
        System.out.println(ergebnis);
        sc.close();
    }
}