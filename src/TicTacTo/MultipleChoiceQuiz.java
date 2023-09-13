import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define quiz questions and answers
        String[] questions = {
                "What is the capital of France?",
                "What is the largest planet in our solar system?",
                "Who wrote the play 'Romeo and Juliet'?"
        };

        String[] options = {
                "A) Paris   B) London   C) Berlin   D) Madrid",
                "A) Venus   B) Mars     C) Jupiter  D) Earth",
                "A) Charles Dickens  B) William Shakespeare  C) Jane Austen  D) J.K. Rowling"
        };

        char[] answers = {'A', 'C', 'B'};

        int score = 0;

        // Display and process the quiz questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);

            if (Character.toUpperCase(userAnswer) == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i] + ".\n");
            }
        }

        // Display the final score
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);

        // Close the scanner
        scanner.close();
    }
}
