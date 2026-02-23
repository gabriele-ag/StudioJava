import java.util.Scanner;

public class Condizioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("È online ?");
        boolean online = scanner.nextBoolean();

        if (online == true) {
            System.out.println("sì");
            scanner.nextLine();
        } else {
            System.out.println("no");
        }
        
        String x = 5 < 10 ? "Sì" : "No";
        System.out.println(x);

        String nome = "Luca";

        switch(nome) {
        case "Luca" :
            System.out.println("Ciao " + nome);
            break;
        case "Marco" :
            System.out.println("Ciao " + nome);
            break;
        case "Antonio" :
            System.out.println("Ciao " + nome);
            break;
        case "Giovanna" :
            System.out.println("Ciao " + nome);
            break;
        case "Erica" :
            System.out.println("Ciao " + nome);
            break;
        default :
            System.out.println("Ciao chiunque tu sia");
            break;
        }

        int i = 5;
        while(i < 0 ) {
            System.out.println("While" + i);
            i++;
        }

        do {
            System.out.println("downwhile" + i);
        } while ( i < 0 );

        for (int y = 0; i < 5; y++) {
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

    }
}   
