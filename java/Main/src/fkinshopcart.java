import java.util.Scanner;
import java.util.HashMap;

public class fkinshopcart {
    public static void run() {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Pizza", 15);
        menu.put("Hamburger", 20);
        menu.put("Veg Burger", 10);
        menu.put("French Fries", 5);
        String food_name = "";
        String serving_number = "";
        String anything_else = "";
        int Total = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("");
        System.out.println("  Hi! Welcome To Dirotori.  ");
        System.out.println("");
        System.out.println("O=========================O");
        System.out.println("| Food Name    |   Pricing|");
        System.out.println("O--------------|----------O");
        System.out.println("|  Pizza       |     $15  |");
        System.out.println("| Hamburger    |     $20  |");
        System.out.println("|Veg burger    |     $10  |");
        System.out.println("|French Fries  |      $5  |");
        System.out.println("O=========================O");
        System.out.println("");
        while (!menu.containsKey(food_name)) {
            System.out.print("Enter The Name Of The Serving: ");
            food_name = s.nextLine();

            if (!menu.containsKey(food_name)) {
                System.out.println("That Food Doesn't Exist You Idiot!");
            }
        }

        int price = menu.get(food_name);
        System.out.println("Very Well, You Want To Have " + food_name + " of $" + price + " ! ");
        System.out.println("May I Know How Many Servings You Require?");
        while (serving_number.isEmpty()) {
            System.out.print("");
            serving_number = s.nextLine();
            try {
                if (Integer.parseInt(serving_number) <= 0) {
                    throw new NumberFormatException();
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("Bro I meant how many of it do you want? Enter in number please.");
                serving_number = "";
            }
        }

        Total = Integer.parseInt(serving_number) * menu.get(food_name);

        System.out.println("Very Well, You Want To Have " + serving_number + " " + food_name + "!");
        while (anything_else.isEmpty()) {
            System.out.print("Is There Anything Else You May Require? (yes/no): ");
                anything_else = s.nextLine();
            if (anything_else.equals("no")) {
                System.out.println("Very Well then, Thanks For Visiting Dirotori!");
                System.out.println("Your Total is $" + Total);
                System.out.println("Please Get a Job First!");
            }
        }
        

        s.close();
    }
}
