package ch.sebooom.dddlab.infratructure;

import ch.sebooom.dddlab.infratructure.event.EventPublisherImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.Environment;
import reactor.bus.EventBus;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@Configuration
public class ApplicationConfiguration {
    @Bean
    Environment env(){

        return Environment.initializeIfEmpty();
    }

    @Bean
    EventBus createEventBus(Environment env){

        return EventBus.create(env,Environment.THREAD_POOL);
    }

    @Bean
    EventPublisherImpl eventPublisher(){
        return new EventPublisherImpl();
    }
}
