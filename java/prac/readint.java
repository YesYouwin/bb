// Read int determine
// 1. It's digit
// 2. Sum of Digits
// 3. First and Last Digits

import java.util.Scanner;

public class readint {
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);

        System.out.println("***************************************");
        System.out.println("DIGIT READER");
        System.out.println("INPUT: (ex: 122424)");
        System.out.println("Result: No. Of Digits, Sum of digits");
        System.out.println("First digit, last digit");
        System.out.println("***************************************");
        System.out.print("INPUT: ");
        n = num.nextInt();
        num.close();

        digit(n);
        sum(n);
        fas(n);
    }

    static void digit(int n) {
        int nd = 0;
        while(n!=0){
            nd++;
            n = n/10;
        }
        System.out.println("The Number Of Digits = "+ nd);
    }

    static void sum(int n) {
        int sum = 0;
        while(n!=0) {
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("The Sum Of The Number Of Digits = "+ sum);
    }

    static void fas(int n){
        int s = n%10;
        while (n/10 != 0) {
            n = n/10;
        }
        System.out.println("The First Digit Of The Digit Is: "+ n);
        System.out.println("The Last Digit Of The Digit Is: "+ s);
    }
}