package introjavaws21;

import java.util.List;

public class Quiz {
    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    private List<Question> questions;

    @Override
    public String toString() {
        return "Quiz{" +
                "questions=" + questions+
                '}';
    }
}
