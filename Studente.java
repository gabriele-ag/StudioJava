public class Studente extends Costruttore {

    String materiaPreferita = "Matematica";
    String classe = "2G";
    int[] votiMatematica = {9, 9, 9}; 
    
    Studente(String nome, String cognome, String materiaPreferita) {
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;
    }

    void studia() {
        System.out.println("Sto studiando...");
    }

    @Override
    void salutaPersona() {
        System.out.println("Buongiorno prof!");
    }
}
