public class MainPizza {
    
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("integrale", "pomodoro");
        Pizza pizza2 = new Pizza("5 cereali");
        Pizza pizza3 = new Pizza("integrale", "pomodoro", "caciovallo", "prosciutto", "funghi") ;
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
