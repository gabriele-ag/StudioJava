public class MainPersona {
    
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.println(persona1.nome);
        System.out.println(persona2.nome);

        persona1.saluta();
        persona2.cammina();
    }
}
