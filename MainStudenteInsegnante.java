public class MainStudenteInsegnante {
    
    public static void main(String[] args) {
        Studente studente1 = new Studente("Luca", "Rossi", "Storia");
        studente1.salutaPersona();
        
        Insegnante insegnante1 = new Insegnante("Alice", "Pargoli", "Matematica");
        insegnante1.salutaPersona();

        System.out.println(insegnante1.materia);
    }
}
