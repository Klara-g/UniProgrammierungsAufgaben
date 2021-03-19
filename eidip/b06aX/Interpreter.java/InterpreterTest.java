import java.util.Scanner;
public class InterpreterTest {
    public static void main(String []args){
        for(boolean nochmal = true; nochmal; ){ //für Nutzer zum wiederholten Eingeben 
       System.out.println("Das Format für die Eingabe ist vor x in Wort.");
            try{
        String ausgabe = " ";
        Scanner sc = new Scanner(System.in);
        ausgabe = Interpreter.verarbeite(sc);
        nochmal = false;
        System.out.println(ausgabe);
       }
        catch(Exception e){ //der benutzer möchter wissen, was er nun eingeben soll
            e.printStackTrace(); //für mich: Wo ist die Exception gekommen?
         System.out.println("Ihre Eingabe ist zu kurz.");
         System.out.println("Nochmal!");
         nochmal = true;
        }
 }
}
}
