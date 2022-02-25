package introjava.ws2122;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Path;

// @SpringBootApplication is a convenience annotation that adds:
// @Configuration: Tags the class as a source of bean definitions for the application context.
// @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,other beans, and various property settings.
// @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
@SpringBootApplication
public class QuizApplication {

	public static QuizService quizService;

	static {
		try {
			quizService = QuizService.load();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

}
