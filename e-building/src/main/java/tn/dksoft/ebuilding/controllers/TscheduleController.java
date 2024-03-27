package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.TscheduleService;
import tn.dksoft.ebuilding.dtos.TscheduleDTO;
import tn.dksoft.ebuilding.entities.Tschedule;
@RestController
@RequestMapping("/api/schedule")
public class TscheduleController extends GenericController<Tschedule, Long, TscheduleDTO> {
    @Autowired
    public TscheduleController(TscheduleService service) {
        super(service);
    }
}
