import java.util.Scanner;

public class Binary{
    public static void main(String[] args) {
        boolean Running = true;
        Scanner input = new Scanner(System.in);
        while (Running) {
            System.out.println("What Would You Like To Do?");
            System.out.println("Option 0: Exit");
            System.out.println("Option 1: Binary -> Decimal");
            System.out.println("Option 2: Decimal -> Binary");
            System.out.println("Option 3: Binary Addition");
            System.out.print("Enter The Option Number -> ");
            int a = input.nextInt();
            input.nextLine();

            switch (a) {
                case 0 -> Running = false;
                case 1 -> BinaryToDec(input);
                case 2 -> DecToBinary(input);
                case 3 -> AddBinary(input);
            }
        }
        input.close();
        System.out.println("Thanks For Using Binary Calculator.");
    }

    static void BinaryToDec(Scanner input) {

        System.out.print("Enter The Binary Number: ");
        String a = input.nextLine();
        double ans = 0;
        int x = String.valueOf(a).length()-1;

        for(int i = x; i > -1; i--) {
            if (String.valueOf(a).charAt(i) == '1') {
                ans = ans + Math.pow(2, (x-i));
            }
        }
        
        System.out.println(ans);
        System.out.println("");
    }

    static void DecToBinary(Scanner input) {
        
        System.out.print("Enter The Decimal Number: ");
        int a = input.nextInt();
        if (a < 0) {System.out.println("Negative number nahi hota bsdk.");}
        int i = 0;
        long ans;
        
        for(ans = 0; a != 0; i = 0) {
            for(i = 0; Math.powExact(2,i) <= a; i++){
                if((Math.powExact(2,i+1) > a && Math.powExact(2,i) <= a)) {
                    ans = ans + Math.powExact(10,i);
                    a = a - Math.powExact(2,i);
                }
            }
        }
        System.out.println(ans);
        System.out.println("");
    }

/*     static void AddBinary(Scanner input) {
        System.out.print("Enter The First Decimal Number: ");
        String a = input.nextLine(); 
        System.out.print("Enter The Second Decimal Number: ");
        String b = input.nextLine(); 

        int x = a.length() > b.length() ? a.length() : b.length();
        char carry = '0';
        StringBuilder ans = new StringBuilder();

        for (int i = x - 1; i > -1; i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == '1') {
                ans.append('1');
                carry = '1';
            }
            else if (a.charAt(i) == '1' && b.charAt(i) == '1' || a.charAt(i) == '1' && carry == '1' || b.charAt(i) == '1' && carry == '1') {
                    ans.append('0');
                    carry = '1';
            }
            else if (a.charAt(i) == '1'|| b.charAt(i) == '1' ||carry == '1') {
                    ans.append('1');
                    carry = '0';
            }
        }
        System.out.println(ans);
    }
    */
}