package event;

import common.DomainEvent;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public class DemandeInitialiseEvent implements DomainEvent {

    private String test;

    public DemandeInitialiseEvent(String test){
        this.test = test;
    }
}
