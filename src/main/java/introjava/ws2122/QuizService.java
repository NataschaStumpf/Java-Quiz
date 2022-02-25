package introjava.ws2122;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.*;

// database
public class QuizService {

    private QuestionDatabase db;
    private Map<String, List<Question>> categoryQuestions;
    private List<Quiz> quizzes;

    public QuizService(QuestionDatabase db) {
        this.db = db;
        categoryQuestions = new HashMap<>();
        for(Question q : db.getQuestions()){
            for(String c: q.getCategories()){
                List<Question> questions = categoryQuestions.getOrDefault(c, new ArrayList<>());
                questions.add(q);
                categoryQuestions.put(c, questions);
            }
        }
    }

    public static QuizService load() throws IOException {
        ObjectMapper jackson = new ObjectMapper();
        QuestionDatabase db = jackson.readValue(Path.of("quiz-questions").toUri().toURL(), QuestionDatabase.class);
        return new QuizService(db);
    }

    public Quiz createNewQuiz(int count, String category) {
       List<Question> possibleQuestions = categoryQuestions.getOrDefault(category, Collections.emptyList());
       Collections.shuffle(possibleQuestions);

       List<Question> quizQuestions = new ArrayList<>(count);
       for(int i=0; i < count && i < possibleQuestions.size(); i++){
           quizQuestions.add(possibleQuestions.get(i));
       }
       Quiz quiz = new Quiz(quizzes.size(), quizQuestions, category);
       quizzes.add(quiz);
       save();
       return quiz;
    }

    public Quiz getQuizById(int quizId) {
        return quizzes.get(quizId);
    }

    public void safe(int quizId, int questionId, boolean result, Question answer) {
        Quiz quiz = quizzes.get(quizId);
        quiz.save(questionId, result, answer);
        save();
    }

    private void save(){
        //TODO safe all quizzes?
    }
}
