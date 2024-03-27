package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.InvoiceItemService;
import tn.dksoft.ebuilding.dtos.InvoiceItemDTO;
import tn.dksoft.ebuilding.entities.InvoiceItem;
@RestController
@RequestMapping("/api/iteminvoice")
public class InvoiceItemController extends  GenericController<InvoiceItem, Long, InvoiceItemDTO> {
    @Autowired
    public InvoiceItemController(InvoiceItemService service) {
        super(service);
    }
}
