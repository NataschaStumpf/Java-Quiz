package introjava.ws2122;

import java.util.List;

public class Quiz {
    private int quizId;
    private List<Question> questions;
    private int nextQuestionIdx = 0;

    private List<String> answers = new ArrayList<>();

    public Quiz(int quizId, List<Question> quizQuestions, String category) {
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "questions=" + questions+
                '}';
    }

    public QuizQuestion getNextQuestion() {
        Question question = questions.get(nextQuestionIdx);
        return new QuizQuestion(quizId, question.getId(), question.getChoices());
    }

    public Question getQuestion(int questionId) {
    }

    public QuizScore getScore() {
    }

    public void save(int questionId, boolean result, Question answer) {
        answers.set(questionId, answer);
        nextQuestionIdx++;
    }
}
