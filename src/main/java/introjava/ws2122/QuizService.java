package introjava.ws2122;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

// database
public class QuizService {

    // json file mit dem Quiz einlesen
    private static final Path dbJSON = Path.of("quiz-questions.json");
    private static final ObjectMapper jackson = new ObjectMapper();

    private final Database db;
    private final Map<String, List<Question>> categoryQuestions;

    public QuizService(Database db) {
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

    // Quiz wird geladen
    public static QuizService load() throws IOException {
        Database db = jackson.readValue(dbJSON.toUri().toURL(), Database.class);
        return new QuizService(db);
    }


    public Quiz createNewQuiz(int count, String category) throws IOException {
        // Kategorie wird übergeben --> Fragen herausgeholt (kann auch leer sein)
        // Array wird zurückgeben mit den Fragen zur entsprechenden Kategorie
       List<Question> possibleQuestions = categoryQuestions.getOrDefault(category, Collections.emptyList());
       // shuffle: zufällige Frage genommen
       Collections.shuffle(possibleQuestions);

        // Maximal-Größe des Quiz bestimmen count und questions
        // von 0 angefangen solange durchlaufen bis count kleier ist als die möglichen Fragen ODER alle möglichen Fragen durch sind
       int limit = Math.min(count, possibleQuestions.size());
       List<Question> quizQuestions = new ArrayList<>(limit);
        for(int i=0; i < limit; i++){
           quizQuestions.add(possibleQuestions.get(i));
       }

       Quiz quiz = new Quiz(db.getQuizes().size(), quizQuestions, category);
       db.getQuizes().add(quiz);
       save();
       return quiz;
    }

    public Quiz getQuizById(int quizId) {
        return db.getQuizes().get(quizId);
    }

    public void safe(int quizId, boolean result, String answer) throws IOException {
        Quiz quiz = getQuizById(quizId);
        // die Antwort sollen in der json file gespeichert werden
        quiz.save(result, answer);
        save();
    }

    // gegebene Antworten in json file geschrieben (save)
    private void save() throws IOException {
        jackson.writerWithDefaultPrettyPrinter()
                .writeValue(dbJSON.toFile(), db);
    }
}
