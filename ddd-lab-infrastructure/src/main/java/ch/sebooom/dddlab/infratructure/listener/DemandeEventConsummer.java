package ch.sebooom.dddlab.infratructure.listener;

import common.DomainEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.bus.EventBus;
import reactor.fn.Consumer;

import static reactor.bus.selector.Selectors.$;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@Service
public class DemandeEventConsummer implements Consumer<Event<DomainEvent>> {

    @Autowired
    public DemandeEventConsummer(EventBus eventBus){
        eventBus.on($("demandeListener"),this);
    }

    @Override
    public void accept(Event<DomainEvent> domaineEvent) {
        DomainEvent event = domaineEvent.getData();
        System.out.println(event);
    }
}
