import java.util.Scanner;

public class compound_interest{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal, amount, rate;
        int timesCompounded, years;

        System.out.print("Enter The Principal Amount: ");
        principal = input.nextDouble();
        System.out.print("Enter The Interest Rate (in %): ");
        rate = input.nextDouble() / 100;
        System.out.print("Enter The Times Compounded Per Year (1, 2, 3, 4): ");
        timesCompounded = input.nextInt();
        System.out.print("Enter The Number Of Years: ");
        years = input.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The Amount After %d years is: $%.2f", years, amount);

        input.close();
    }
}