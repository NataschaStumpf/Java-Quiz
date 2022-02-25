package introjava.ws2122;

import java.util.List;

public class QuizQuestion {
    private int quizId;
    private int questionId;
    private List<String> answers;

    public QuizQuestion(int quizId, int id, List<String> choices) {
        this.quizId = quizId;
        this.questionId = id;
        this.answers = choices;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" +
                "quizId=" + quizId +
                ", questionId=" + questionId +
                ", answers=" + answers +
                '}';
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
