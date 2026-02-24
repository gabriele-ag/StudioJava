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
    }
}
