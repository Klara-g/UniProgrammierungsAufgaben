package b07a4;
/**
 * @author kgolub2s
 */

 //mit John in Partnerarbeit gemacht :)

public class Uhrzeit {
    private int stunde = 0; // [0;23]
    private int minute = 0; //[0;59]
    static boolean is24h = true;

    public Uhrzeit(){
        this.stunde = 0; //nicht notwendig
        this.minute = 0;
    }
    public Uhrzeit(int s){
        this.stunde = s;
        this.minute = 0;
    }
    public Uhrzeit(int s, int m){
        this.stunde = s;
        this.minute = m;
    }
    public Uhrzeit(Uhrzeit kopieUhrzeit){
        this.stunde = kopieUhrzeit.stunde;
        this.minute = kopieUhrzeit.minute;
    }
    public int stunde(){ //Kapselung: Instanzvariablen private
        return this.stunde; //von außen lesbar, aber nicht veränderbar
    }
    public int minute(){
        return this.minute; 
    }
    public boolean equals(Uhrzeit vorgabeUhrzeit){ 
        if (this.stunde != vorgabeUhrzeit.stunde) {
            return false;
        }
        if (this.minute != vorgabeUhrzeit.minute) {
            return false;
        }else{
            return true; 
        }
    }
    public boolean istFrueher(Uhrzeit fruehereUhrzeit){ 
       if(this.stunde == fruehereUhrzeit.stunde){
           if(this.minute >= fruehereUhrzeit.minute){
               return false;
           }else{
               return true;
           }
       } 
       if(this.stunde > fruehereUhrzeit.stunde){
               return false;
       }
       else{
           return true;
           }     
    }
    public String toString() { //
        String stundeString = " ";
        String minuteString = " ";
        String neueAusgabe = "";
        
        if(stunde < 10){
            stundeString = "0" + stunde;
            //System.out.println(stundeString);
        }else{
            stundeString = ""+ stunde;
        }
        if(minute < 10){
            minuteString = "0" + minute;
            //System.out.println(minuteString);
        }else{
            minuteString = ""+ minute;
            //System.out.println(minuteString);
        }
        
        if(!is24h){  // nicht 24h Modus
            if (stunde < 12 & stunde > 0) {
                neueAusgabe = " a.m.";
            }
            if (stunde >= 12 & stunde < 24) {
                neueAusgabe = " p.m.";
            }
            stundeString = ""+ this.stunde % 12;
            //stundeString.length(); - groeßer als 2 
            if((this.stunde % 12) < 10){
            stundeString = "0" + stundeString;
            }
            return stundeString + ":" + minuteString + neueAusgabe;
        }else{
        return stundeString + ":" + minuteString;
        }
    }
    // Schalter für 24h-Modus
    public static void set12h24h(){ //allgemein für alle 
        is24h = !is24h;
    }
  
}
