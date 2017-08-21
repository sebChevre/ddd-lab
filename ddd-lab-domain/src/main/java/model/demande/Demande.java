package model.demande;

import event.DemandeInitialiseEvent;
import event.EventPublisher;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public class Demande {

    private EventPublisher eventPublisher;

    public static Demande newInstance () {

        Demande demande = new Demande();
        return demande;

    }

    public void initialise() {
        eventPublisher.publish(new DemandeInitialiseEvent("test ok - demande initialise"));
    }


}
