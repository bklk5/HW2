package HW2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentID;
    private String name;
    private List<Reviewer> trustedReviewers;
    private List<Question> questions; 	// List to store questions

    // Constructor
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.trustedReviewers = new ArrayList<>();
        this.questions = new ArrayList<>();
    }

    // upload a question to the console
    public Question uploadQuestion(String content) {
        Question question = new Question(content, this);
        questions.add(question);	// Update question to the list
        return question;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public Question askQuestion(String content) {
        return new Question(content, this);
    }

    public void markAsAccurate(Answer answer) {
        answer.markAsAccurate();
    }

    public void deleteQuestion(Question question) {
        question.delete();
    }

    public void deleteAnswer(Answer answer) {
        answer.delete();
    }

    public void addTrustedReviewer(Reviewer reviewer) {
        trustedReviewers.add(reviewer);
    }

    public void removeTrustedReviewer(Reviewer reviewer) {
        trustedReviewers.remove(reviewer);
    }

    // view the list of unresolved questions
    public List<Question> viewUnresolvedQuestions(List<Question> allQuestions) {
        List<Question> unresolvedQuestions = new ArrayList<>();		// create the list 
        for (Question question : allQuestions) {
            if (!question.isResolved()) {
                unresolvedQuestions.add(question);		// if the question is not resolved then it's added 
            }
        }
        return unresolvedQuestions;
    }
}