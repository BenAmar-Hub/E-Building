package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.EntranceNoteService;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.dtos.EntranceNoteDTO;
import tn.dksoft.ebuilding.entities.EntranceNote;
@RestController
@RequestMapping(value = "/api/bonentree")
public class EntranceNoteController extends GenericController<EntranceNote, Long, EntranceNoteDTO> {
    @Autowired
    public EntranceNoteController(EntranceNoteService service) {
        super(service);
    }
}
