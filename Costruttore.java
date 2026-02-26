public class Costruttore {
    
        String nome;
        String cognome;
        static int numeroPersone;

        Costruttore(String nome, String cognome) {
            this.nome = nome;
            this.cognome = cognome;
            numeroPersone++;
            System.out.println(numeroPersone);

        }

        void salutaPersona() {
            System.out.println("ciao sono " + this.nome);
        }

        public String toString() {
            String stringa = this.nome + "\n" + this.cognome;
            return stringa;
        }

        void newSaluta(Costruttore personaDaSalutare) {
            System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + this.nome);
        }
    }

