
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample login details
        String correctEmail = "student@gmail.com";
        String correctPassword = "12345";

        System.out.println("======================================");
        System.out.println("      ONLINE EXAMINATION SYSTEM");
        System.out.println("======================================");

        // LOGIN
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (!email.equals(correctEmail) ||
            !password.equals(correctPassword)) {

            System.out.println("\nInvalid email or password.");
            System.out.println("Login failed.");
            sc.close();
            return;
        }

        System.out.println("\nLogin successful!");
        System.out.println("Welcome to the examination.");

        // QUESTIONS
        String[] questions = {
            "What is JVM?",
            "Which keyword is used to create a class in Java?",
            "Which method is the starting point of a Java program?",
            "Which data type stores true or false?",
            "Which symbol is used to end a Java statement?"
        };

        String[][] options = {
            {
                "A. Java Variable Machine",
                "B. Java Virtual Machine",
                "C. Java Version Machine",
                "D. Java Visual Machine"
            },
            {
                "A. create",
                "B. class",
                "C. ClassName",
                "D. newclass"
            },
            {
                "A. start()",
                "B. run()",
                "C. main()",
                "D. execute()"
            },
            {
                "A. int",
                "B. String",
                "C. boolean",
                "D. char"
            },
            {
                "A. :",
                "B. .",
                "C. ,",
                "D. ;"
            }
        };

        char[] correctAnswers = {
            'B',
            'B',
            'C',
            'C',
            'D'
        };

        int score = 0;

        // EXAM
        System.out.println("\n======================================");
        System.out.println("          JAVA PROGRAMMING EXAM");
        System.out.println("======================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            String answer = sc.nextLine().toUpperCase();

            if (answer.length() == 1 &&
                answer.charAt(0) == correctAnswers[i]) {

                score++;
            }
        }

        // RESULT
        System.out.println("\n======================================");
        System.out.println("              EXAM RESULT");
        System.out.println("======================================");

        System.out.println("Student: " + email);
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (questions.length - score));
        System.out.println("Score: " + score + "/" + questions.length);

        double percentage =
                ((double) score / questions.length) * 100;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }

        System.out.println("======================================");
        System.out.println("       Thank you for attending!");
        System.out.println("======================================");

        sc.close();
    }
}
