package ch.sebooom.dddlab.infratructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import reactor.bus.EventBus;

import java.util.Arrays;

/**
 * @Configuration tags the class as a source of bean definitions for the application context.
 * @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings,
 * other beans, and various property settings.
 * Normally you would add @EnableWebMvc for a Spring MVC app,
 * but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
 * @ComponentScan tells Spring to look for other components,
 * configurations, and services in the hello package, allowing it to find the controllers.
 */
@SpringBootApplication
@ImportResource({"file:/application.xml"})
public class Application {

    @Autowired
    private EventBus eventBus;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    /**
     * Démarre au démarrage de l'application
     * Liste les beans fournis par Spring
     * @param ctx
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

            initEventBisConfiguration();

        };
    }

    private void initEventBisConfiguration() {




    }
}
