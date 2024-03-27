package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.ConsumableService;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.dtos.ConsumableDTO;
import tn.dksoft.ebuilding.entities.Consumable;
@RestController
@RequestMapping("/api/consumable")
public class ConsumableController extends GenericController<Consumable,Long, ConsumableDTO> {
    @Autowired
    public ConsumableController(ConsumableService service) {
        super(service);
    }
}
