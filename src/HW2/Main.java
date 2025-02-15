package HW2;

import java.util.Scanner;

//** This class if for the user to write the question and upload on the console 
//	for the pupose of visualization and testing 
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student(1, "Amy");

        // Loop to upload multiple questions
        while (true) {
            System.out.println("Enter your question:");
            String input = scanner.nextLine();

            // type "exit" to stop 
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Upload the question
            Question question = student.uploadQuestion(input);
            System.out.println("Question uploaded: " + question.getContent());
            System.out.println("Total questions: " + student.getQuestions().size());
        }

        // Display all uploaded questions
        System.out.println("\nList of uploaded questions:");
        for (Question question : student.getQuestions()) {
            System.out.println("- " + question.getContent());
        }

        scanner.close();
    }
}