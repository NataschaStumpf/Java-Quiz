package introjava.ws2122;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private int quizId;
    private List<Question> questions;
    private String category;
    private List<String> answers = new ArrayList<>();
    private int nextQuestionIdx = 0;

    public Quiz() {
    }


    public Quiz(int quizId, List<Question> quizQuestions, String category) {
        this.quizId = quizId;
        this.questions = quizQuestions;
        this.category = category;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public int getNextQuestionIdx() {
        return nextQuestionIdx;
    }

    // nextQuestion.Idx: Index kann größer sein als die Fragen, die ich habe
    // keine Abbruch-Bestimmung für das Quiz (kann quasi unendlich laufen)
    public void setNextQuestionIdx(int nextQuestionIdx) {
        this.nextQuestionIdx = nextQuestionIdx;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Annotation: Methode der Elternklasse soll überschrieben werden (keinen direkten Einfluss auf Code)
    @Override
    public String toString() {
        return "Quiz{" +
                "questions=" + questions +
                '}';
    }

    @JsonIgnore
    public Question getNextQuestion() {
        Question question = questions.get(nextQuestionIdx);
        return question;
    }


    public Question getQuestion(int questionId) {
        return questions.get(questionId);
    }

    @JsonIgnore
    public QuizScore getScore() {
        return new QuizScore();
    }

    public void save(boolean result, String answer) {
        answers.add(answer);
        nextQuestionIdx++;
    }
}
