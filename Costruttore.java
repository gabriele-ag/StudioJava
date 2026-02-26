public class Costruttore {
    
        String nome;
        String cognome;
        int eta;
        String colorePreferito;

        Costruttore(String nome, String cognome, int eta, String colorePreferito) {
            this.nome = nome;
            this.cognome = cognome;
            this.eta = eta;
            this.colorePreferito = colorePreferito;
        }

        void salutaPersona() {
            System.out.println("ciao sono " + this.nome);
        }

        public String toString() {
            String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito;
            return stringa;
        }

        void newSaluta(Costruttore personaDaSalutare) {
            System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + this.nome);
        }
    }

