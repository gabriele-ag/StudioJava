public class Methods {
    public static void main(String[] args) {
        
        cucinoPranzo("carne");
        int totale = somma(2,3);
        double totaleDouble = sommaDouble(2.5,3.5);
        System.out.println(totale);
        System.out.println(totaleDouble);
        
    }

    static void cucinoPranzo(String cibo) {
            System.out.println("sto cucinando " + cibo);
    }

    static int somma(int a, int b) {
            int risultato = a + b;
            return risultato;
    }

    static double sommaDouble(double a, double b) {
            double risultato = a + b;
            return risultato;
    }


}

