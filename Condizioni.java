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
    }
}   
