// Yes I was in commerce
import java.util.Scanner;   

public class banking{
    public static void main(String[] args) {
        HashMap<String, Account> Account = HashMap<>();
        String deposit, withdraw, balance, res, account;
        String error = "\u001B[31mError: \u001B[0m";
        
        
        Scanner input = new Scanner(System.in);
       
        while (!(res.equalsIgnoreCase("exit") || res.equals("4"))) {
            
            System.out.println("************************");
            System.out.println("Please Select An Option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("************************");
            System.out.print("");
            res = input.nextLine();
            
            if (!( res.equals("1") || res.equals("2") || res.equals("3") || res.equals("4"))) {
            System.out.println(error + "You Entered An Invalid Option!");
            System.out.println(error + "Please Enter Between (1, 2, 3, 4) Options.");
            continue;
            }

            if (res.equals("1")) {
                System.out.println("\u001B[32mGreat! How Much Do You Want To Deposit? ");
                System.out.print(": ");
                deposit = input.nextLine();
                double d = Double.parseDouble(deposit);

                
                System.out.print("\u001B[32mExcellent! What Account Does It Belong To? ");
                System.out.print(": ");
                account = input.nextLine();
                System.out.println("\u001B[32mYou Now Have " + balance + "");

            }
        }
    input.close();
    
    }
}