import java.sql.*;
import java.util.Scanner;

public class sql_test1 {
    static final String url = "jdbc:postgresql://localhost:5432/sql_lab";
    static final String user = "postgres";
    static final String password = "3575";

    public static void main(String[] args) {
        String subject;
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to do? (INSERT/DELETION) :  ");
        String in = input.nextLine();

        switch(in) {
            case "INSERT", "insert" -> {
                System.out.print("Enter The Short Name Of The Subject: ");
                subject = input.nextLine();
                System.out.print("Enter The Full Name Of The Subject: ");
                String fn = input.nextLine();
                System.out.print("Enter The Image URL/PATH: ");
                String img_url = input.nextLine();

                insertion(subject, fn, img_url);
            }

            case "DELETION", "deletion" -> {
                System.out.print("Enter The Short Name Of The Subject: ");
                subject = input.nextLine();

                deletion(subject);
            }
        }
        input.close();
    }
    
    static void insertion(String subject, String fn, String img_url) {
        String sql = "INSERT INTO public.subjects (subject_name, subject_fn, subject_logo) VALUES ('"+subject+"', '"+fn+"', '"+img_url+"')";
        try (Connection db = DriverManager.getConnection(url, user, password); // opening db connection
            Statement statement = db.createStatement()) { // created a statement object
            statement.executeUpdate(sql); // executing the string named sql

            System.out.println("Subject Insertion Complete");
            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void deletion(String subject) {
        String deleteSql = "DELETE FROM public.subjects WHERE subject_name = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement delsql = conn.prepareStatement(deleteSql)) {
                delsql.setString(1, subject);
                int rowsDeleted = delsql.executeUpdate();

                System.out.println(rowsDeleted > 0 ? "Records Deleted Successfully" : "Records Not Found Under The Name " + subject);
            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}