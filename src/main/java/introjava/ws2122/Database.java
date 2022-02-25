package introjava.ws2122;

import java.util.List;

public class Database {
    List<Question> questions;
    List<String> categories;

    List<Quiz> quizzes;

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "QuestionDatabase{" +
                "questions=" + questions +
                ", categories=" + categories +
                ", quizzes=" + quizzes +
                '}';
    }
}
