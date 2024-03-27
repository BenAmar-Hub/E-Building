package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.AdressDto;
import tn.dksoft.ebuilding.dtos.QualificationDTO;
import tn.dksoft.ebuilding.entities.Qualification;
import tn.dksoft.ebuilding.entities.TAddress;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.QualificationMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.QualificationRepository;

@Service(value = "QualificationService")
@Transactional
public class QualificationServiceImpl extends GenericServiceImpl<Qualification, Long, QualificationDTO> implements QualificationService{
    @Autowired
    public QualificationServiceImpl(QualificationRepository qualificationRepository, QualificationMapper qualificationMapper) {
        super(qualificationRepository, qualificationMapper);
    }
}
