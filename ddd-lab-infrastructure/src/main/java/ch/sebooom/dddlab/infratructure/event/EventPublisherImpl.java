package ch.sebooom.dddlab.infratructure.event;

import common.DomainEvent;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.bus.Event;
import reactor.bus.EventBus;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public class EventPublisherImpl {

    @Autowired
    private EventBus eventBus;

    public  void publish(DomainEvent domainEvent){
        eventBus.notify("demandeListener",Event.wrap(domainEvent));
    }
}
