package introjava.ws2122;

import java.util.List;

public class Question {
    private int id;
    private String question;
    private String answer;

    private List<String> categories;
    private List<String> choices;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.question + " | " + this.answer + " | " + this.categories + " | " + this.choices;
    }
}
