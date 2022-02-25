package introjava.ws2122;

public class AnswerResult {
    private int quizId;
    private int questionId;
    private boolean result;
    private String correctAnswer;

    public AnswerResult(int quizId, int questionId, boolean result, String correctAnswer) {
        this.quizId = quizId;
        this.questionId = questionId;
        this.result = result;
        this.correctAnswer = correctAnswer;
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

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "AnswerResult{" +
                "quizId=" + quizId +
                ", questionId=" + questionId +
                ", result=" + result +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
