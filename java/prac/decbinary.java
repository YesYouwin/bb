import java.util.Scanner;

public class decbinary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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
        
        input.close();
        System.out.println(ans);
    }
}