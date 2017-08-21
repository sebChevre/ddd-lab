package ch.sebooom.dddlab.infratructure.service;

import ch.sebooom.dddlab.application.DemandeService;
import ch.sebooom.dddlab.infratructure.event.EventPublisherImpl;
import event.DemandeInitialiseEvent;
import model.demande.Demande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.demande.DemandeRepository;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@Service
public class DemandeServiceImpl implements DemandeService{

    @Autowired
    private DemandeRepository demandeRepository;

    @Autowired
    EventPublisherImpl eventPublisher;


    @Override
    public Demande findDemande() {
        Demande demande = demandeRepository.findDemande();
        eventPublisher.publish(new DemandeInitialiseEvent("test ok event"));
        return demande;
    }

    @Override
    public void initilise() {
        Demande demande = Demande.newInstance();

        demande.initialise();


    }
}
