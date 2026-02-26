public class MainPersona {
    
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.println(persona1.nome);
        System.out.println(persona2.nome);

        persona1.saluta();
        persona2.cammina();

        Costruttore persona3 = new Costruttore("Giovanni", "Gemini", 25, "blu");
        Costruttore persona4 = new Costruttore("Alice", "Rossi", 28, "giallo");

        System.out.println(persona3.cognome);
        System.out.println(persona4.cognome);

        persona3.salutaPersona();

        
        Costruttore newPersona = new Costruttore("Giovanni", "Pinello", 34, "rosso");
        Costruttore newPersona2 = new Costruttore("Giada", "Libelli", 25, "blu");
        Costruttore newPersona3 = new Costruttore("Alice", "Marza", 35, "giallo");

        Costruttore[] persone = {newPersona, newPersona2, newPersona3};

        System.out.println(persone[1]);

        newPersona.newSaluta(newPersona2);

    }
}
