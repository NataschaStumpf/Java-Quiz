package introjava.ws2122;

import introjava.ws2122.Questions;

import java.util.List;

public class Quiz {
    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    private List<Questions> questions;

    @Override
    public String toString() {
        return "Quiz{" +
                "questions=" + questions+
                '}';
    }
}
