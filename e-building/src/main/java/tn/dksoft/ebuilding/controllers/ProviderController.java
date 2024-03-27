package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.ProviderService;
import tn.dksoft.ebuilding.dtos.ProviderDTO;
import tn.dksoft.ebuilding.entities.Provider;

@RestController
@RequestMapping("/api/provider")
public class ProviderController extends GenericController<Provider, Long, ProviderDTO> {
    @Autowired
    public ProviderController(ProviderService providerService) {
        super(providerService);
    }
}
