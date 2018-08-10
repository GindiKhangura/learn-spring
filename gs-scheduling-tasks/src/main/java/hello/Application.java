package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The annotation {@code @SpringBootApplication} does a bunch of stuff, one of
 * them is to look for components (like ScheduledTasks); in this case, it will
 * look for components in the 'hello' package according to
 * <a href="https://spring.io/guides/gs/scheduling-tasks/">this guide</a>.
 */
@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class);
	}

}
