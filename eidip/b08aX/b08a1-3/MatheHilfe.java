public class MatheHilfe {

        private static int addRekPos(int a, int b) {
            if (b == 0) {
                return a;
            }
            return addRekPos(++a, --b);
        }

        public static int addRek(int a, int b) {
            if (b < 0) {
                return -addRekPos(-a, -b);
            }
            return addRekPos(a, b);
        }

        private static int subRekPos(int a, int b) {
            if (b == 0) {
                return a;
            }
            return subRekPos(--a, --b);
        }

        public static int subRek(int a, int b) {
            if (b < 0) {
                return -subRekPos(-a, -b);
            }
            return subRekPos(a, b);
        }

        private static int mulRekPos(int a, int b) {
            if (b == 0) {
                return 0;
            }
            return addRek(a, mulRekPos(a, --b));
        }

        public static int mulRek(int a, int b) {
            if (b < 0) {
                return -mulRekPos(a, -b);
            }
            return mulRekPos(a, b);
        }

        private static int divRekPos(int a, int b, int erg) {
            if (a < b) {
                return erg;
            }
            return divRekPos(subRek(a, b), b, ++erg);
        }

        public static int divRek(int a, int b) {
            if ((a < 0) & (b < 0)) {
                return divRekPos(-a, -b, 0);
            }
            if (a < 0) {
                return -divRekPos(-a, b, 0);
            }
            if (b < 0) {
                return -divRekPos(a, -b, 0);
            }
            return divRekPos(a, b, 0);
        }

        private static int modRekPos(int a, int b) {
            if (a < b) {
                return a;
            }
            return modRekPos(subRek(a, b), b);
        }

        public static int modRek(int a, int b) {
            if (a < 0 & b < 0) {
                return -modRekPos(-a, -b);
            }
            if (a < 0) {
                return -modRekPos(-a, b);
            }
            if (b < 0) {
                return modRekPos(a, -b);
            }
            return modRekPos(a, b);
        }

        private static int powRekPos(int a, int b) {
            if (b == 0) {
                return 1;
            }
            return mulRek(a, powRekPos(a, --b));
        }

        public static int powRek(int a, int b) {
            return powRekPos(a, b);
        }
    }

}
