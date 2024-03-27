package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.InvoiceService;
import tn.dksoft.ebuilding.dtos.InvoiceDTO;
import tn.dksoft.ebuilding.entities.Invoice;
@RestController
@RequestMapping("/api/invoice")
public class InvoiceController extends GenericController<Invoice, Long, InvoiceDTO> {
    @Autowired
    public InvoiceController(InvoiceService service) {
        super(service);
    }
}
