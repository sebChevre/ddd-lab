package ch.sebooom.dddlab.application;

import model.demande.Demande;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public interface DemandeService {

    Demande findDemande();

    void initilise();
}
