import java.util.ArrayList;

public class ForArray {
    public static void main(String[] args) {

        for (int y = 0; y < 5; y++) {
            System.out.println("riga" + y);
        }

        int[] numeri = {20,30,40,50,60};
        for (int numero: numeri) {
            System.out.println(numero);
        }

        String[][] classi = {
            {"Luca", "Anna", "Marco"},
            {"Edoardo", "Giovanni", "Erica"},
            {"Mario", "Luigi", "Alice"}
        };

        // classi[0][0] = "Luca";
        // classi[0][1] = "Anna";
        // classi[0][2] = "Marco";

        // classi[1][0] = "Edoardo";
        // classi[1][1] = "Giovanni";
        // classi[1][2] = "Erica";
        
        // classi[2][0] = "Mario";
        // classi[2][1] = "Luigi";
        // classi[2][2] = "Alice";

        for(int classe = 0; classe < classi.length; classe++) {
            System.out.println();
            for(int studente = 0; studente < classi[classe].length; studente++) {
                System.out.print(classi[classe][studente] + " ");
            }
        }

        for(String[] classe: classi) {
            System.out.println();
            for(String studente: classe) {
                System.out.print(studente + " ");
            }
        }

        String nuovoNome = "Leonardo";
        boolean risultato = nuovoNome.equalsIgnoreCase("LEOnardo");
        int risultatoDue = nuovoNome.length();
        char risultatoTre = nuovoNome.charAt(5);
        int risultatoQuattro = nuovoNome.indexOf("a");
        boolean risultatoCinque = nuovoNome.isEmpty();
        String risultatoSei = nuovoNome.toLowerCase();
        String risultatoSette = nuovoNome.toUpperCase();
        String risultatoOtto = nuovoNome.trim();
        String risultatoNove = nuovoNome.replace("o","w");

        
        System.out.println(risultato);
        System.out.println(risultatoDue);
        System.out.println(risultatoTre);
        System.out.println(risultatoQuattro);
        System.out.println(risultatoCinque);
        System.out.println(risultatoSei);
        System.out.println(risultatoSette);
        System.out.println(risultatoOtto);
        System.out.println(risultatoNove);


        ArrayList<String> persone = new ArrayList<String>();
        // ArrayList ha bisogno del wrapper

        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");

        persone.set(2, "Paola");
        persone.remove(0);
        persone.clear();

        for (int j = 0; j < persone.size(); j++) {
            System.out.println(persone.get(j));
        }

        ArrayList<ArrayList<String>> classiNuove = new ArrayList();

        ArrayList<String> classeUno = new ArrayList<String>();
        classeUno.add("Luca");
        classeUno.add("Matteo");

        ArrayList<String> classeDue = new ArrayList<String>();
        classeDue.add("Giovanna");
        classeDue.add("Alice");

        classiNuove.add(classeUno);
        classiNuove.add(classeDue);
        
        for (int i = 0; i < classiNuove.size(); i++) {
            System.out.println();
            for (int j = 0; j < classiNuove.get(i).size(); j++) {
                System.out.print(classiNuove.get(i).get(j) + " ");
            }
        }
    }
}
