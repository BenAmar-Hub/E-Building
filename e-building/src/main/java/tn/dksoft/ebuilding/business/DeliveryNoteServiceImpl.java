package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.DeliveryNoteDTO;
import tn.dksoft.ebuilding.entities.DeliveryNote;
import tn.dksoft.ebuilding.mappers.DeliveryNoteMapper;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.repositories.DeliveryNoteRepository;
import tn.dksoft.ebuilding.repositories.GenericRepository;
@Service(value = "deliveryNoteService")
@Transactional
public class DeliveryNoteServiceImpl extends GenericServiceImpl<DeliveryNote, Long, DeliveryNoteDTO>implements DeliveryNoteService {
    @Autowired
    public DeliveryNoteServiceImpl(DeliveryNoteRepository noteRepository, DeliveryNoteMapper noteMapper) {
        super(noteRepository, noteMapper);
    }
}
