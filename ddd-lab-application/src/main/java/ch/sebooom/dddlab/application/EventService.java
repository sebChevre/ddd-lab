package ch.sebooom.dddlab.application;

import common.DomainEvent;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public interface EventService {

    void publieEvenement(DomainEvent domainEvent);
}
