
import java.util.Scanner;

public class Interpreter {
    public static String verarbeite(Scanner sc) {
        String vor = "vor";
        //String nach = "nach";
        String in = "in";
        boolean ausgabeVorZeichenGewollt = true;
        char zeichen = 'a';
        String zeichenfolge = "";
        int i = 0;
        int gefundenBei = -8;
        while (sc.hasNext()) {
            //Position Zeichen in Zeichenfolge
            //"vor" "nach" binäre Entscheidung zwischen vor und nach gespeichert in variable 
            ausgabeVorZeichenGewollt = (sc.next().equals(vor));
            zeichen = sc.next().charAt(0);
            in = sc.next();
            zeichenfolge = sc.next();
            i = 0;
            //Position herausfinden von zeichen in zeichenfolge
            while(i<zeichenfolge.length()){
                if(zeichen == (zeichenfolge.charAt(i)) && gefundenBei == -8){
                gefundenBei = i+1;//+1 stelle, ohne +1 index
                }
                i++;
            }
            System.out.println(zeichen);
            System.out.println(zeichenfolge);
            System.out.println(gefundenBei);

            if(ausgabeVorZeichenGewollt){
                if(gefundenBei== -8){
                    return "";
                }
                return zeichenfolge.substring(0,gefundenBei);
            }else{
                if(gefundenBei== -8){
                    return zeichenfolge;
                }
                return zeichenfolge.substring(gefundenBei,zeichenfolge.length());
            }
        }
    return "";
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        verarbeite(sc);
    }
}
