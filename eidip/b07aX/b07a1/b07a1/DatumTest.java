public class DatumTest {
   public static void main(String[] args) {
    Datum lustigesDatum = new Datum();
    String unnötig = "Mai";
    String falsch = "John";
    Datum deux = new Datum(3);
    Datum drei = new Datum(2000, 10, 5);
    char fallNull = '0';
    char fallA = 'a';

    //System.out.println("deux.nameVonMonat: " + deux.nameVonMonat(deux));
    System.out.println(Datum.nameVonMonat(deux.monat()));
    System.out.println(Datum.nameVonMonat(deux));
    System.out.println(Datum.nameVonMonat(14));
    System.out.println(Datum.monatVonName(unnötig));
    System.out.println(Datum.monatVonName(falsch));
    Datum.setFormatTZ(fallA);
    System.out.println(drei.toString());
    
   


    /*

    Datum unlustigesDatum = lustigesDatum.getThisTomorrow();
    System.out.println("neu.toString: " + lustigesDatum.toString());
    System.out.println("drei.toString: " + unlustigesDatum.toString());
    System.out.println("drei.toString: " + unlustigesDatum.getThisTomorrow().toString());
    Datum neu = new Datum();
    
    //Typ Variable =(Zuweisung zu Rückgabe von rechts) new-Schlüsselwort Konstruktor(Argumente);
    Datum zwei = new Datum(5); //zweiter Konstruktor //ich speicher in zwei, ein Objekt vom typ Datum
    System.out.println("leerer Konstruktor: "+" "+neu.jahr() + " "+ neu.monat() + " "+ neu.tag());
    System.out.println("Datum(5): " + " " + zwei.jahr() + " " + zwei.monat() + " " + zwei.tag());
    //System.out.println("Diese Datum ist"+" "+ "9" + " "+ neu.tag);
    Datum kopie = new Datum(zwei);
    System.out.println("Kopie von zwei: " + " " + kopie.jahr() + " " + kopie.monat() + " " + kopie.tag());
    System.out.println("zwei.equals(zwei): "+ zwei.equals(zwei));               
    System.out.println("zwei.equals(neu): " + zwei.equals(neu));
    System.out.println("zwei.equals(kopie): " + zwei.equals(kopie));
    System.out.println("zwei.istFrueher(kopie): " + zwei.istFrueher(kopie));
    System.out.println("neu.istFrueher(kopie): " + neu.istFrueher(kopie));
    System.out.println("zwei.istFrueher(neu): " + zwei.istFrueher(neu));
    System.out.println("zwei.istFrueher(drei): " + zwei.istFrueher(drei));
    System.out.println("zwei.toString: " + zwei.toString());
    */
}
} 