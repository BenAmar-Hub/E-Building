package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.InvoiceItemDTO;
import tn.dksoft.ebuilding.entities.InvoiceItem;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.InvoiceItemMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.InvoiceItemRepository;
@Service(value = "invoiceItemService")
@Transactional
public class InvoiceItemServiceImpl extends GenericServiceImpl<InvoiceItem, Long, InvoiceItemDTO> implements InvoiceItemService {
   @Autowired
   public InvoiceItemServiceImpl(InvoiceItemRepository itemRepository, InvoiceItemMapper itemMapper) {
        super(itemRepository, itemMapper);
    }
}
