package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.QualificationService;
import tn.dksoft.ebuilding.dtos.QualificationDTO;
import tn.dksoft.ebuilding.entities.Qualification;
@RestController
@RequestMapping("/api/qualification")
public class QualificationController extends GenericController<Qualification, Long, QualificationDTO> {
    @Autowired
    public QualificationController(QualificationService service) {
        super(service);
    }
}
