import java.util.Scanner;   

public class Calculator {
    public static void run() {
                
        // declaration like response = 0 or remainder = 0 {remainder for diivsion}
        double res = 0;
        double rem = 0.0;

        // This shit does the user input, U make a scanner with new scanner(System.in) import it's java.util.Scanner and then
        // You make prompts for user input

        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number:");
        String first_number = scanner .nextLine();
            System.out.print("Enter the action: ");
        String action = scanner .nextLine();
            System.out.print("Enter another number: ");
        String second_number = scanner .nextLine();
            System.out.print("Great! Do you want to do " + first_number + action + second_number + " ? (yes/no): ");  
        String response = scanner.nextLine();
        scanner.close();

        // Basically a string to number specifically decimal -ish number converter with the use of "double". The parse is a new thing I just found out about
        double f = Double.parseDouble(first_number);
        double s = Double.parseDouble(second_number);

        // if yes 
        // Also equals.IgnoreCase ignores the type of character like lowercase or uppercase so the code doesn't end if it receives a dumb response
        if (response.equalsIgnoreCase("yes")) {
            if (action.equals("+")) {
                res = f + s;
                System.out.println("Result: " + res);
            } 
            else if (action.equals("-")) {
                res = f - s;
                System.out.println("Result: " + res);
            }
            else if (action.equals("*")) {
                res = f * s;
                System.out.println("Result: " + res);
            }
            else if (action.equals("/")) {
                res = f / s; 
                rem = f % s;
                System.out.println("Result is " + res + " with a remainder of " + rem);
            }
        }
        else if (response.equals("no")) {
            System.out.println("Well Fuck You Then.");
        }
        else {
            System.out.println("Please use the fucking options.");
        }
    }
    
}
