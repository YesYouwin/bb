// This contains the swapping puzzle.
// 1. with temporary variable
// 2. with no variable
// The reason I'm doing it in java is because I've done it in C already.

import java.util.Scanner;

public class swapping{
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);

        System.out.println("***************************************");
        System.out.println("VARIABLE SWAPPER");
        System.out.println("INPUT: First_Number, Second_Number");
        System.out.println("Result: Second_Number, First_Number");
        System.out.println("***************************************");
        System.out.print("First Number: ");
            x = input.nextInt();
        System.out.print("First Number: ");
            y = input.nextInt();

        input.close();

        var(x,y);
        novar(x,y);
    }

    private static void var(int x, int y) {
        int z;
        z = x;
        x = y;
        y = z;

        System.out.println("***************************************");
        System.out.println("WITH VARIABLE");
        System.out.println("The Value Of The First Number is: " + x);
        System.out.println("The Value Of The Second Number is: " + y);
        System.out.println("***************************************");
    }

    private static void novar(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("***************************************");
        System.out.println("WITHOUT VARIABLE");
        System.out.println("The Value Of The First Number is: " + x);
        System.out.println("The Value Of The Second Number is: " + y);
        System.out.println("***************************************");
    }
}