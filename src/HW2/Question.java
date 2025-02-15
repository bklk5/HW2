package HW2;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private int questionID;
    private String content;
    private Student student;
    private List<Answer> answers;
    private boolean isResolved;

    public Question(String content, Student student) {
        this.content = content;
        this.student = student;
        this.answers = new ArrayList<>();
        this.isResolved = false;
    }

    public String getContent() {
        return content;
    }

    public Student getStudent() {
        return student;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public boolean isResolved() {
        return isResolved;
    }
    
    
//** Implement methods of question class
    // add an answer 
    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    // mark the question as resolved 
    public void markAsResolved() {
        this.isResolved = true;
    }

    // delete the question
    public void delete() {
        // Implementation 
    }
}