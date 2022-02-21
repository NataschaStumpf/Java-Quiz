package introjavaws21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;

// @SpringBootApplication is a convenience annotation that adds:
// @Configuration: Tags the class as a source of bean definitions for the application context.
// @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,other beans, and various property settings.
// @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
@SpringBootApplication
public class QuizApplication {

	public static QuizService quizService;

	static {
		quizService = new QuizService(Path.of("questions.json"), Path.of("history.json"));
	}


	public static void main(String[] args) {

		SpringApplication.run(QuizApplication.class, args);
	}

}
