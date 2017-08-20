package ch.sebooom.dddlab.infratructure.service;

import ch.sebooom.dddlab.application.DemandeService;
import ch.sebooom.dddlab.infratructure.event.EventPublisher;
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
    EventPublisher eventPublisher;


    @Override
    public Demande findDemande() {
        Demande demande = demandeRepository.findDemande();
        eventPublisher.publish(new DemandeInitialiseEvent("test ok event"));
        return demande;
    }
}
