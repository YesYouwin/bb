import java.util.Scanner;   

public class Calculator {
    public static void main(String[] args) {
                
        // declaration like response = 0 or remainder = 0 {remainder for diivsion}
        double res = 0;
        double rem = 0;
        boolean hasResult = false;
        String response = "No";

        // This shit does the user input, U make a scanner with new scanner(System.in) import it's java.util.Scanner and then
        // You make prompts for user input

        Scanner scanner = new Scanner(System.in);
            System.out.print("\u001B[0mEnter a number: ");
        String first_number = scanner .nextLine();
        double f = Double.parseDouble(first_number);

        while (!response.equalsIgnoreCase("Yes")) {
            if (hasResult) {
                f = res;
            }
            System.out.print("\u001B[0mEnter The Action That Will Occur With " + f + ": ");
                String action = scanner .nextLine();
                if (!(action.equals("+") || action.equals("-") || action.equals("/") || action.equals("x"))) {
                        System.out.println("\u001B[31mYou Entered An Invalid Action.");
                        System.out.println("Allowed Actions are { + , - , / , x }");
                        continue;
                    }
                
            System.out.print("Enter another number: ");
                String second_number = scanner .nextLine();

            // Basically a string to number specifically decimal -ish number converter with the use of "double". The parse is a new thing I just found out about
            double s = Double.parseDouble(second_number);

            // if yes 
            // Also equals.IgnoreCase ignores the type of character like lowercase or uppercase so the code doesn't end if it receives a dumb response
            if (action.equals("+")) {
                res = f + s;
                System.out.println("Result: " + res);
            } 
            else if (action.equals("-")) {
                res = f - s;
                System.out.println("Result: " + res);
            }
            else if (action.equals("x")) {
                res = f * s;
                System.out.println("Result: " + res);
            }
            else if (action.equals("/")) {
                if (s == 0) {
                    System.out.println("\u001B[31mError: Cannot divide by zero.");
                    continue;
                }
                res = f / s; 
                rem = f % s;
                System.out.println("Result is " + res + " with a remainder of " + rem);
            }

            hasResult = true;
            
            System.out.print("Are you finished? (yes/no): ");  
                response = scanner.nextLine();
        }
        scanner.close();
        System.out.println("\u001B[32mGreat! Your Final Answer Is: " + res);
        System.out.println("\u001B[0m");
    }
}
