package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.EntranceNoteDTO;
import tn.dksoft.ebuilding.entities.EntranceNote;
import tn.dksoft.ebuilding.mappers.EntranceNoteMapper;
import tn.dksoft.ebuilding.repositories.EntranceNoteRepository;
@Service(value = "EntranceNoteService")
@Transactional
public class EntranceNoteServiceImpl extends GenericServiceImpl<EntranceNote, Long, EntranceNoteDTO> implements EntranceNoteService {
    @Autowired
    public EntranceNoteServiceImpl(EntranceNoteRepository noteRepository, EntranceNoteMapper noteMapper) {
        super(noteRepository, noteMapper);
    }
}
