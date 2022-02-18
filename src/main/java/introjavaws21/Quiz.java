package introjavaws21;

public class Quiz {

    private int id;
    private String question;
    private String answer;
    private String categories;
    private String choices;


    // Getter and  Setter id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter question
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    // Getter and Setter answer
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Getter and Setter categories
    public String getCategories() {return categories;}
    public void setCategories(String categories) { this.categories = categories; }

    // Getter and Setter choices
    public String getChoices() {return choices;}
    public void setChoices(String choices) { this.categories = choices; }


    public String toString(){
        return this.id+" | "+this.question +" | "+this.answer+" | "+this.categories+" | "+this.choices;
    }
}
