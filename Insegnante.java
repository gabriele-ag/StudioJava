public class Insegnante extends Costruttore {
    String materia = "Matematica";
    String[] classi = {"1G", "2G", "3G"};

    Insegnante(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
    }

    void insegna() {
        System.out.println("Sto insegnando...");
    }

    @Override
    void salutaPersona() {
        System.out.println("Buongiorno ragazzi!");
    }
}
