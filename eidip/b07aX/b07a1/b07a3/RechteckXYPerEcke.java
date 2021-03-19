package b07a3;
/**
 * @author kgolub2s
 */
 //mit John in Partnerarbeit gemacht :)

public class RechteckXYPerEcke {
    
    private Punkt2D linksU; 
    private Punkt2D rechtsO;
    
    public RechteckXYPerEcke(double xLinks, double xRechts, double yUnten, double yOben){
       this.linksU = new Punkt2D(xLinks, yUnten);
       this.rechtsO = new Punkt2D(xRechts, yOben);
    }
   
    public RechteckXYPerEcke(Punkt2D links, Punkt2D rechts){
        if(links.y() < rechts.y()){
            this.rechtsO = new Punkt2D(rechts); 
            this.linksU = new Punkt2D(links); // neue Instanz erzeugt mit Kopiekonstruktor
            //System.out.println("rechtsO und linksU: "+this.toString());

        }else{
            this.linksU = new Punkt2D(links.x(), rechts.y());
            this.rechtsO = new Punkt2D(rechts.x(), links.y());
            //System.out.println("rechtsU und linksO: "+this.toString());
        }
    }

    public RechteckXYPerEcke(RechteckXYPerEcke kopieRechteck){
        this.linksU = kopieRechteck.linksU; //neues Objekt mit gleichen Werten
        this.rechtsO = kopieRechteck.rechtsO;
    }

    public boolean equals(RechteckXYPerEcke vorgabeWerte){
        if(!(this.linksU.equals(vorgabeWerte.linksU))){ 
            return false;
        }
        if(!(this.rechtsO.equals(vorgabeWerte.rechtsO))){
            return false;
        }else{
            return true;
        }
    }

    public double breite(){
       double breite = this.rechtsO.x() - this.linksU.x(); // minus den x Wert von linksU der Instanz
       return breite;
    }
    
    public double hoehe() {
        double hoehe = this.rechtsO.y() - this.linksU.y();
        return hoehe;
    }
    public Punkt2D ecke(boolean istRechts, boolean istOben){
        
        // double x = (istRechts) ? this.rechtsO.x() : this.linksU.x();
        // double y = (istOben) ? this.rechtsO.y() : this.linksU.y();
        if(istOben & istRechts){ //oben rechts 
            double x = rechtsO.y();
            double y = rechtsO.x();
            return new Punkt2D(x, y);

        }if(!istOben & !istRechts){ //unten links
            double x = linksU.y();
            double y = linksU.x();
            return new Punkt2D(x, y);

        }if(!istOben & istRechts){ //unten rechts
            double x = linksU.y();
            double y = rechtsO.x();
            return new Punkt2D(x, y);

        }else{ //oben links (implizit)
            double x = linksU.x();
            double y = rechtsO.y();
            return new Punkt2D(x, y);
        }
        
    }
    public Punkt2D ecke(int vorgabeZahl){ //mögliche Ecken nach Nummerierung
        //gespeichert: nur Instanzvariabeln zurückgeben
        if(vorgabeZahl == 0){
            return linksU;
        }
        if (vorgabeZahl == 2) {
            return rechtsO;
        }
        //berechnet
        if(vorgabeZahl == 1){
            double y = this.linksU.y(); 
            double x = this.rechtsO.x();
            return new Punkt2D(x,y);  
        }else{
            double y = this.rechtsO.y();
            double x = this.linksU.x();
            return new Punkt2D(x, y); 
        }
    }

    public Punkt2D mitte(){

       double breite = this.rechtsO.x() - this.linksU.x();
       double halbeBreite = breite/2;  
       double hoehe = this.rechtsO.y() - this.linksU.y();     
       double halbeHoehe = hoehe/2;
       double breiteP = this.linksU.x() + halbeBreite;
       double hoeheP = this.linksU.y() + halbeHoehe;
       return new Punkt2D(breiteP, hoeheP);
    }

    public double durchmesser(){
       return linksU.abstand(rechtsO); //siehe JavaDoc von Punkt2D.abstand()
    }
    public double umfang(){
        double breite = this.rechtsO.x() - this.linksU.x();
        double hoehe = this.rechtsO.y() - this.linksU.y();
        return 2 * breite + 2 * hoehe;
    }
    public double flaeche(){
        double breite = this.rechtsO.x() - this.linksU.x();
        double hoehe = this.rechtsO.y() - this.linksU.y();
        return breite * hoehe;
    }
    public RechteckXYPerEcke verschiebe(double dx, double dy){
       this.linksU.verschiebe(dx, dy); //verschiebe von Punkt2D
       this.rechtsO.verschiebe(dx, dy);
       return this; 
    }
    
    public String toString() {
        String lup = this.linksU.toString();
        String rop = this.rechtsO.toString();

        return "[" + lup + ", " + rop + "]";
    }
}