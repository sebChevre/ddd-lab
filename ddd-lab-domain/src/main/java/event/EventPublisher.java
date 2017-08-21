package event;

import common.DomainEvent;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public interface EventPublisher {

    public void publish(DomainEvent event);
}
