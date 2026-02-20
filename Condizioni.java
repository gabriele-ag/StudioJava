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
    }
}   
