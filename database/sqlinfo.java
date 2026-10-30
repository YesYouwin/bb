/*
CREATE TABLE public.questions (                            
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL,
    subject TEXT NOT NULL,
    xp INTEGER NOT NULL DEFAULT 10
);

CREATE TABLE public.dbname (
    nameoftable (id) typeoftable (INTEGER) containertype (GENERATED ALWAYS AS IDENTITY PRIMARY KEY),
    nameoftable (question) typeoftable(TEXT) containertype (NULL/NOT NULL),
    nameoftable (answer) typeoftable(TEXT) containertype (NULL/NOT NULL),
    nameoftable (subject) typeoftable(TEXT) containertype (NULL/NOT NULL),
    nameoftable (xp) typeoftable(INTEGER) containertype (NULL/NOT NULL) default.value (DEFAULT 10),
);

------------------------ For Relational Row  -------------------------
subject_id INTEGER NOT NULL REFERENCES public.subjects(id), 
----------------------------------------------------------------------

------------------------ To Add new stuff in an exiting table -------------------------
ALTER TABLE public.subjects
ADD CONSTRAINT subjects_name_unique UNIQUE (subject_name);
---------------------------------------------------------------------------------------

------------------------ JAVA DB INTIALIZATION -------------------------
static final String URL = "jdbc:postgresql://localhost:5432/quesbb_lab";
static final String USER = "postgres";
static final String PASSWORD = "YOUR_POSTGRES_PASSWORD";

public static void main(String[] args) {
    Connection db = DriverManager.getConnection(URL, USER, PASSWORD);                      Sends request to db with url, user and password.
} 
------------------------------------------------------------------------

------------------------ INSERTING TO DB----------------------------------------------------------------------------------

System.out.print("Enter Subject's Full Name: ");
String fullname = input.nextLine().trim();

System.out.print("Enter Subject logo path/URL: ");
String logo = input.nextLine().trim();
String insertSubject = "INSERT INTO public.subjects " + "(subject_name, subject_fn, subject_logo) " + "VALUES (?, ?, ?)";

try (PreparedStatement add = db.prepareStatement(insertSubject, Statement.RETURN_GENERATED_KEYS)) { 
    add.setString(1, subject);
    add.setString(2, fullname);
    add.setString(3, logo);
    add.executeUpdate();

----------------------------------------------------------------------------------------------------------------------------

javac -cp ".;postgresql-42.7.14.jar" sql_test1.java
java -cp ".;..\postgresql-42.7.14.jar" sql_test1


*/
