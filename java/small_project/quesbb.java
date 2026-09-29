import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class quesbb {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        int pxp, obxp, oaxp, adxp, mxp;
        int xp = 0;
        String a;
        boolean isRunning = true;

        while (isRunning){
            System.out.println("***************************");
            System.out.println("QUESTION PAPER VERSION 1");
            System.out.println("***************************");
            System.out.println("MATHS: 0");
            System.out.println("PCC: 0/2");
            System.out.println("OA: 0");
            System.out.println("OB: 0");
            System.out.println("Aditya waala subject: 0");
            System.out.println("***************************");
            System.out.println("Exit");
            System.out.println("***************************");

            System.out.println("What Subject Would You Like To Start With Today?");
            System.out.print(": ");
                a = input.nextLine();
            System.out.println("");

            // || works with boolean expressions, not integers. 
            // Hence we use , commas instead cuz of mutiple case labels.
            switch(a.toLowerCase()) {
                case "maths" , "math" -> MATH(xp); 
                case "pcc" , "programming concept for c" -> PCC(xp); 
                case "ob" , "organizational behavior", "organisational Behavior" -> OB(xp); 
                case "oa" , "office automation" , "ms word" -> OA(xp); 
                case "etc" , "who" , "aditya waala subject" , "taste bud is a software" -> ETC(xp); 
                case "exit" -> isRunning = false;
            }
        }
    }

    static void PCC(int xp) {
        Random rng = new Random();
        String[] questions = {
            "What is The Definition Of Variables?", 
            "What is the "
        };

        String[] answers = {
            "A Variable in C is a named storage location in memory used to store data values that can be modified and reused during program execution.",
            "Question kaha bna abhi tak bsdk?"
        };

        int i = rng.nextInt(questions.length);

        System.out.println("* " + questions[i]);
        System.out.print("Ans:- ");
        String ans = input.nextLine();

        if (!ans.equals(answers[i])) {
            System.out.println("L idiot wrong answer");
        }
        else {
            System.out.println("Karliya cheating?");
        }
    }

    static void MATH(int xp) {
        Random rng = new Random();
        System.out.println("WORK IN PROGRESS :(");
    }

    static void OB(int xp) {
        Random rng = new Random();
        System.out.println("WORK IN PROGRESS :(");
    }

    static void OA(int xp) {
        Random rng = new Random();
        System.out.println("WORK IN PROGRESS :(");
    }

    static void ETC(int xp) {
        Random rng = new Random();
        System.out.println("WORK IN PROGRESS :(");
    }
}