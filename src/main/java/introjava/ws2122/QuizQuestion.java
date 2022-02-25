package introjava.ws2122;

import java.util.List;

public class QuizQuestion {
    private int quizId;
    private String txt;
    private List<String> answers;

    public QuizQuestion(int quizId, String txt, List<String> choices) {
        this.quizId = quizId;
        this.txt = txt;
        this.answers = choices;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" +
                "quizId=" + quizId +
                ", txt=" + txt +
                ", answers=" + answers +
                '}';
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
