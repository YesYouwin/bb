// Tasks Remaining: Creating AnswerDef. Creating Question Loop. Returning xp for projection. NEW UI. Adding Topic Search In Question. 
// Adding Topic Search to AnswerDef. Unique Questions everytime in qna. Only prac gets similar once.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.net.URI; // Uniform resource identifier URI.create("https://abcdefghijkl.supabase.co/rest/v1/questions"); || basically a url talking plugin
import java.net.http.HttpClient; // HttpClient lets Java do: Java -> HTTP request -> Supabase -> HTTP response || Talker over http 
import java.net.http.HttpRequest; // A specific destination for information to be taken from || What do you specifically need?
import java.net.http.HttpResponse; // This is the receiver to the httpclient's request.

public class quesbb {

    static final String SUPABASE_URL = "https://usvxygcjcolidagjhqzo.supabase.co"; // Contains the project link 
    static final String SUPABASE_KEY = "sb_publishable_y7ZG19ngnvtfpLBNaLuMCw_RnTYL9jb"; // This is the public key for the project itself
    static final HttpClient HTTP = HttpClient.newHttpClient(); // A decoy http request
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
            System.out.println("MOC: " + mxp + "/0");
            System.out.println("PCC: "+pxp+"/2");
            System.out.println("OA: "+oaxp+"/0");
            System.out.println("OB: "+obxp+"/0");
            System.out.println("ETC: "+adxp+"/80");
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
                case "moc", "maths", "math" -> {
                    int earned = qna("MOC");
                    xp += earned;
                    mxp += earned;
                }
                
                case "pcc", "programming concept for c" -> {
                    int earned = qna("PCC");
                    xp += earned;
                    pxp += earned;
                }
                
                case "ob", "organizational behavior", "organisational Behavior" -> {
                    int earned = qna("OB");
                    xp += earned;
                    obxp += earned;
                }
                
                case "oa", "office automation", "ms word" -> {
                    int earned = qna("OA");
                    xp += earned;
                    oaxp += earned;
                }
                
                case "etc", "who", "aditya waala subject", "taste bud is a software" -> {
                    int earned = qna("ETC");
                    xp += earned;
                    adxp += earned;
                }
                
                case "exit" -> isRunning = false;
            }
        }
    }

    static String fetchinfo(String subject) {
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
    
    static int qna(String subject) {
        String questions = fetchinfo(subject);
        int qc = 0;
        int sp = 0;
        int sxp = 0;
        Random rng = new Random();

        ArrayList<String> commend = new ArrayList<>();
        ArrayList<String> bully = new ArrayList<>();
        
        commend.add("SIX SEVENN"); commend.add("Bade tez ho rhe ho"); commend.add("America Kya Kehta tha, kya Ho Tum? AAJ HUM KEHTE HAI TU KYA HAI BE?");
        commend.add("Vasteguna Huiyaa");
        bully.add("Aye maar sale ka khopdi tod"); bully.add("America Kya Kehta tha, kya Ho Tum? Aaj bhi wahi kehta hai sirf teri wajah se");
        bully.add("Lavden Bhujyam"); bully.add("Chacha kya ho gaya aapko?"); bully.add("Nikal L****! Pehli Phursat mein Nikal");
            
        if (questions.isEmpty()) {
                System.out.println("No Questions Found Regarding This Subject");
                return 0;
            }

        while (true) {
            int position = questions.indexOf("\"question\"", sp);
            if (position == -1) {
                break;
            }
            qc++;
            sp = position + 1;
        }

        while (true) {
            ArrayList<String> keywordList = new ArrayList<>();
            String com = commend.get(rng.nextInt(commend.size()));
            String bul = bully.get(rng.nextInt(bully.size()));
            int randomQuestion = rng.nextInt(qc);
            boolean keywordsCorrect = true;
            sp = 0;
            int questionPosition = -1;
    
            for (int i = 0; i <= randomQuestion; i++) { // < = are two symbol and when combined for some reason show up as <=in this software
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

            int keyPosition = questions.indexOf("\"answer_keywords\"", questionEnd);
            int keyStart = questions.indexOf("[", keyPosition);
            int keyEnd = questions.indexOf("]", keyStart);
            String keywords = questions.substring(keyStart + 1, keyEnd);
            String[] keywordArray = keywords.split(",");
            
            for (String keyword : keywordArray) {
                keywordList.add(keyword.replace("\"", "").trim());
            }
    
            int xpPosition = questions.indexOf("\"xp\"",answerEnd);
            int xpStart = questions.indexOf(":", xpPosition) + 1;
            int xpEnd = questions.indexOf("}",xpStart);
            int questionXP = Integer.parseInt(questions.substring(xpStart, xpEnd).trim());
    
            System.out.println("* " + question + " (Type 'Exit' If You want to leave )");
            System.out.print("Ans:- ");
            String ans = input.nextLine();

            for (String keyword : keywordList) {
                if (!ans.toLowerCase().contains(keyword.toLowerCase())) {
                    keywordsCorrect = false;
                    break;
                }
            }
            
            if (ans.equalsIgnoreCase(correctAnswer)) {
                System.out.println("\n\u001B[32m"+ com + "\u001B[0m");
                System.out.println("+" + questionXP + " XP");
                sxp += questionXP;
            }
            else if (keywordsCorrect) {
                System.out.println("\n\u001B[32m"+ com + "\u001B[0m");
                System.out.println("+" + questionXP + " XP");
                sxp += questionXP;
            }
            else if (ans.equalsIgnoreCase("exit")) {break;}
            else {
                System.out.println("\n\u001B[31m"+ bul +"\u001B[0m");
                System.out.println("Correct answer: "+ correctAnswer);
            }
        }
        return sxp;
    }
}


