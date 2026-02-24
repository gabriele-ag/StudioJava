public class Pizza {
    
    String impasto;
    String salsa;
    String formaggio;
    String extra;
    String extra2;

    Pizza(String impasto) {
        this.impasto = impasto;
        System.out.println("ingredienti: " + impasto);
    }

    Pizza(String impasto, String salsa) {
        this.impasto = impasto;
        this.salsa = salsa;
        System.out.println("ingredienti: " + impasto + ", " + salsa);
    }

    Pizza(String impasto, String salsa, String formaggio, String extra, String extra2) {
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        this.extra2 = extra2;
        System.out.println("ingredienti: " + impasto + ", " + salsa + ", " + formaggio + ", " + extra + ", " + extra2);
    }
}
