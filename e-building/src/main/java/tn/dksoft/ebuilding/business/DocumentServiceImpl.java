package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.DocumentDTO;
import tn.dksoft.ebuilding.entities.Document;
import tn.dksoft.ebuilding.mappers.DocumentMapper;
import tn.dksoft.ebuilding.repositories.DocumentRepository;
@Service(value = "documentService")
@Transactional
public class DocumentServiceImpl extends GenericServiceImpl<Document, Long, DocumentDTO> implements DocumentService {
    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository, DocumentMapper documentMapper) {
        super(documentRepository, documentMapper);
    }
}
