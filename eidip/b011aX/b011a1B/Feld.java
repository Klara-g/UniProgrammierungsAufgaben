package b011a1;

import b10a3.DynFeldVonInt;
import b10a5.SWIFT;

public class Feld {
    public static int anzahlIdentisch(Object[] obj, Object o) {
        int a = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == (o)) {
                ++a;
            }
        }
        return a;
    }

    public static int anzahlGleich(Object[] obj, Object o) {
        int a = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getClass().equals(o.getClass())) {
                ++a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Object[] o = new Object[3];
        o[0] = new Integer(12);
        o[1] = new SWIFT();
        DynFeldVonInt dynFeldVonInt = new DynFeldVonInt(2);
        o[2] = dynFeldVonInt;
        int anz = anzahlGleich(o, new DynFeldVonInt(4));
        System.out.println(anz + "");
    }
}
