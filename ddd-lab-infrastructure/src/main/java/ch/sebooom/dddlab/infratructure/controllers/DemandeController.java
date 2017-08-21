package ch.sebooom.dddlab.infratructure.controllers;

import ch.sebooom.dddlab.application.DemandeService;
import model.demande.Demande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@RestController
public class DemandeController {

    @Autowired
    DemandeService demandeService;

    @RequestMapping(method = RequestMethod.GET, value = "/demande")
    public Demande getDemande() {
        return demandeService.findDemande();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/demande")
    public void initiliseDemande() {
         demandeService.initilise();
    }
}
