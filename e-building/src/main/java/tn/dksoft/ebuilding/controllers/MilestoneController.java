package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.MilestoneService;
import tn.dksoft.ebuilding.dtos.MilestoneDTO;
import tn.dksoft.ebuilding.entities.Milestone;
@RestController
@RequestMapping("/api/milestone")
public class MilestoneController extends GenericController<Milestone, Long, MilestoneDTO> {
    @Autowired
    public MilestoneController(MilestoneService service) {
        super(service);
    }
}
