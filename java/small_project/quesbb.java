import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
import java.net.URI; // Uniform resource identifier URI.create("https://abcdefghijkl.supabase.co/rest/v1/questions"); || basically a url talking plugin
import java.net.http.HttpClient; // HttpClient lets Java do: Java -> HTTP request -> Supabase -> HTTP response || Talker over http 
import java.net.http.HttpRequest; // A specific destination for information to be taken from || What do you specifically need?
import java.net.http.HttpResponse; // This is the receiver to the httpclient's request.

public class quesbb {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pxp = 0;
        int obxp = 0;
        int oaxp = 0;
        int adxp = 0;
        int mxp = 0;
        int xp = 0;
        String a;
        boolean isRunning = true;

        while (isRunning){
            System.out.println("***************************");
            System.out.println("QUESTION PAPER VERSION 1");
            System.out.println("***************************");
            System.out.println("MATHS: " + mxp + "/0");
            System.out.println("PCC: "+pxp+"/2");
            System.out.println("OA: "+oaxp+"/0");
            System.out.println("OB: "+obxp+"/0");
            System.out.println("ETC: "+adxp+"/60");
            System.out.println("***************************");
            System.out.println("Total: "+xp);
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
                case "etc" , "who" , "aditya waala subject" , "taste bud is a software" -> ETC(xp, adxp);
                case "exit" -> isRunning = false;
            }
        }
    }

    static final String SUPABASE_URL = "https://usvxygcjcolidagjhqzo.supabase.co"; // Contains the project link 
    static final String SUPABASE_KEY = "sb_publishable_y7ZG19ngnvtfpLBNaLuMCw_RnTYL9jb"; // This is the public key for the project itself
    static final HttpClient HTTP = HttpClient.newHttpClient(); // A decoy http request

    static String getQuestions(String subject) {
        try {
            String url = SUPABASE_URL + "/rest/v1/questions" + "?subject=eq." + subject + "&select=question,answer,answer_keywords,xp"; // String for the url
    
            HttpRequest request =
                HttpRequest.newBuilder() // Construction contains :-
                    .uri(URI.create(url)) // Using the string url to create a url here
                    .header("apikey", SUPABASE_KEY) // apikey = SUPABASE_KEY
                    .header("Authorization", "Bearer " + SUPABASE_KEY) // Authorization: Bearer sb_publishable_y7ZG19ngnvtfpLBNaLuMCw_RnTYL9jb  || Basically ur creds
                    .GET() // Finally we get what we came here for which was question,answer,answer_keywords,xp
                    .build(); // 

            HttpResponse<String> response =  // Contacts supabase with the newest url
                HTTP.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
                ); 
                
            return response.body();
        }
        catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

        static void PCC(int xp) {
            System.out.println("WORK IN PROGRESS :(");
        }

    static void MATH(int xp) {
        System.out.println("WORK IN PROGRESS :(");
    }

    static void OB(int xp) {
        System.out.println("WORK IN PROGRESS :(");
    }

    static void OA(int xp) {
        System.out.println("WORK IN PROGRESS :(");
    }
    
    static void ETC(int xp, int adxp) {
        String questions = getQuestions("ETC");
        int qc = 0;
        int sp = 0;
            
        if (questions.isEmpty()) {
                System.out.println("No Questions Found Regarding This Subject");
                return;
            }

        while (true) {
            int position = questions.indexOf("\"question\"", sp);
            if (position == -1) {
                break;
            }
            qc++;
            sp = position + 1;
        }

        Random rng = new Random();
        int randomQuestion = rng.nextInt(qc);
        sp = 0;
        int questionPosition = -1;

        for (int i = 0; i <= randomQuestion; i++) {
               questionPosition = questions.indexOf("\"question\"", sp);
               sp = questionPosition + 1;
           }

        int questionStart = questions.indexOf("\"", questionPosition + 10) + 1;
        int questionEnd = questions.indexOf("\"", questionStart);
        String question = questions.substring(questionStart,questionEnd);

        int answerPosition = questions.indexOf("\"answer\"",questionEnd);
        int answerStart = questions.indexOf("\"", answerPosition + 8) + 1;
        int answerEnd = questions.indexOf("\"", answerStart);
        String correctAnswer = questions.substring(answerStart,answerEnd);

        int xpPosition = questions.indexOf("\"xp\"",answerEnd);
        int xpStart = questions.indexOf(":", xpPosition) + 1;
        int xpEnd = questions.indexOf("}",xpStart);
        int questionXP = Integer.parseInt(questions.substring(xpStart, xpEnd).trim());


        System.out.println("* " + question);
        System.out.print("Ans:- ");
        String ans = input.nextLine();

        if (ans.equalsIgnoreCase(correctAnswer)) {
            System.out.println("\n\u001B[32mKarliya Cheating??\u001B[0m");
            System.out.println("+" + questionXP + " XP");
            adxp += 10;
            xp += 10;  
        }
        else {
            System.out.println("\n\u001B[31mL idiot wrong answer\u001B[0m");
            System.out.println("Correct answer: "+ correctAnswer);
        }
    }
}