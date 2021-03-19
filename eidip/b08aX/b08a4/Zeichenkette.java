/**
 * @author kgolub2s
 */

public class Zeichenkette {
    public static boolean istPalindrom(String s) {
        // return istPalindromLoop(s);
        return istPalindromRek(s);
    }

    public static boolean istPalindromLoop(String s) {
        int laenge = s.length();
        char a;
        char b;
        for (int i = 0; i < laenge; i++) { //Alternative Bedinung: i < laenge/2
            a = s.charAt(i);// von vorn
            b = s.charAt((laenge - 1) - i);// von hinten
            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }
        }
        return true;
    }
    //Einstiegsfunktion
    public static boolean istPalindromRek(String s) {
        return istPalindromRek(s, 0, s.length() - 1);
    }
    //eigentlichen Anweisungen: 
    private static boolean istPalindromRek(String s, int match1, int match2) {
        if (match2 < (s.length() / 2)){
            return true;
        }
        char a;
        char b;
        a = Character.toLowerCase(s.charAt(match1));// von vorn
        b = Character.toLowerCase(s.charAt(match2));// von hinten
        if (a != b) {
            return false;
        } else {
            return istPalindromRek(s, match1 + 1, match2 - 1);
        }
    }

    public static boolean istPalindromRekMitSchleife(String s) {
        int laenge = s.length();
        char a;
        char b;
        if (laenge < 2) {
            return true;
        }
        a = s.charAt(0);// von vorn
        b = s.charAt((laenge - 1));// von hinten
        if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
            return false;
        } else {
            String substring = "";
            for (int i = 1; i < (laenge - 1); i++) {
                substring += s.charAt(i);
            }
            return istPalindromRek(substring);
        }
    }
}
