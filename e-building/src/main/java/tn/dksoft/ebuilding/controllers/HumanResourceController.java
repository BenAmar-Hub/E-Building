package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.HumanResourceService;
import tn.dksoft.ebuilding.dtos.HumanResourceDTO;
import tn.dksoft.ebuilding.entities.HumanResources;
@RestController
@RequestMapping("/api/hm")
public class HumanResourceController extends GenericController<HumanResources, Long, HumanResourceDTO> {
    @Autowired
    public HumanResourceController(HumanResourceService service) {
        super(service);
    }
}
