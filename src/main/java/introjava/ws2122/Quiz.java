package introjava.ws2122;

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

    public Object getNextQuestion() {
        int idx = questions.indexOf(uid);
        if (idx < 0 || idx+1 == questions.size()) return "";
        return questions.get(idx + 1);
    }
}
