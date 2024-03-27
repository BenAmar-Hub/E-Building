package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.DocumentService;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.dtos.DocumentDTO;
import tn.dksoft.ebuilding.entities.Document;
@RestController
@RequestMapping(value = "/api/doc")
public class DocumentController extends GenericController<Document, Long, DocumentDTO> {
    @Autowired
    public DocumentController(DocumentService service) {
        super(service);
    }
}
