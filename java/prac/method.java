import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        
        int a,b,c;
        Scanner user_input = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("MULTIPLICATION ADDITION");
        System.out.println("First_Number * Second Number");
        System.out.println("Result + Third Number");
        System.out.println("********************************");

        System.out.print("Enter The First Number:");
            a = user_input.nextInt();
        System.out.print("Enter The Second Number:");
            b = user_input.nextInt();
        System.out.print("Enter The Third Number:");
            c = user_input.nextInt();

        // This is how you input a method specifically [multiaddition(a, b, c);]
        System.out.println(multi_addition(a, b, c));
    }

    // This is a secondary method that isn't the public one and it can be accessed throughout the code without needing for a loop
    static int multi_addition(int first, int second, int third) {
            return (first * second) + third;
    }
}
