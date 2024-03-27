package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.InvoiceDTO;
import tn.dksoft.ebuilding.entities.Invoice;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.InvoiceMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.InvoiceRepository;
@Service(value = "invoiceService")
@Transactional
public class InvoiceServiceImpl extends GenericServiceImpl<Invoice, Long, InvoiceDTO> implements InvoiceService {
   @Autowired
   public InvoiceServiceImpl(InvoiceRepository invoiceRepository, InvoiceMapper invoiceMapper) {
        super(invoiceRepository, invoiceMapper);
    }
}
