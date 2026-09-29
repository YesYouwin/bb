// Yes I was in commerce
import java.util.HashMap;
import java.util.Scanner;   

public class banking{
    public static void main(String[] args) {
        HashMap<String, Double> user = new HashMap<>(); 
        String deposit, withdraw, res = "", account;
        String error = "\u001B[31mError: \u001B[0m";
        double firmval = 0;
        
        Scanner input = new Scanner(System.in);
       
        while (!(res.equalsIgnoreCase("exit") || res.equals("4"))) {
            
            System.out.println("************************");
            System.out.println("Please Select An Option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("************************");
            System.out.print("Enter A Option (1, 2, 3, 4): ");
            res = input.nextLine();
            
            if (!( res.equals("1") || res.equals("2") || res.equals("3") || res.equals("4"))) {
            System.out.println(error + "You Entered An Invalid Option!");
            System.out.println(error + "Please Enter Between (1, 2, 3, 4) Options.");
            continue;
            }
            
            if (res.equals("1")) {
                System.out.println("Great! How Much Do You Want To Deposit? ");
                System.out.print(": ");
                deposit = input.nextLine();
                double d = Double.parseDouble(deposit);
                
                System.out.print("Excellent! What Account Does It Belong To? ");
                System.out.print(": ");
                account = input.nextLine();
                if (user.containsKey(account)) {
                    user.replace(account, user.get(account) + d);
                }
                else {
                user.put(account, d);
                }
                System.out.println("\u001B[32mGreat! "+ account +" You Now Have $" + user.get(account) + " Deposited In The Bank!\u001B[0m \n");
            }

            if (res.equals("3")) {
                System.out.print("Enter The Username For The Person You Want To Check The Balance Of: ");
                account = input.nextLine();

                if (user.containsKey(account)) {
                    System.out.println("\u001B[32mYou Currently Have $" + user.get(account) + " Deposited In Our Bank.\u001B[0m\n");
                }
                else if (account.equals("ALL")) {
                    System.out.println("We Currently Have "+ user + " As Registered Members Of Our Bank.");
                    System.out.println("They Currently Have "+ user.values() + " Money Respectively Deposited In Our Bank.");
                
                        for (double value : user.values()) {
                            firmval += value;
                        }
                    System.out.println("That Firms Current Value Is At $" + firmval);
                    System.out.println("");
                }
                else {
                    System.out.println("\u001B[31mERROR : \u001B[0mYou Are Currently Not A Registered Member Of Our Bank!!!");
                    System.out.println("Please Deposit Some Money To Get Started.\n");
                }
            }

            
        }
    input.close();
    }
}