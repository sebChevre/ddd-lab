package ch.sebooom.dddlab.infratructure.repository;

import model.demande.Demande;
import org.springframework.stereotype.Repository;
import repository.demande.DemandeRepository;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@Repository
public class DemandeInMemoryRepository implements DemandeRepository {


    @Override
    public Demande findDemande() {
        System.out.println("find demande repo");
        return null;
    }
}
