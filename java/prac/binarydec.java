import java.util.Scanner;
import java.math.*;

public class binarydec{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
        input.close();
    }
}