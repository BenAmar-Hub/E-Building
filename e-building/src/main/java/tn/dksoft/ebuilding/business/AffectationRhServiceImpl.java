package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.AffectationRHDTO;
import tn.dksoft.ebuilding.entities.Affectationrh;
import tn.dksoft.ebuilding.mappers.AffectationRhMapper;
import tn.dksoft.ebuilding.repositories.AffectationRhRepository;
@Service(value = "affectationRhService")
@Transactional
public class AffectationRhServiceImpl extends GenericServiceImpl<Affectationrh, Long, AffectationRHDTO> implements AffectationRhService {
    @Autowired
    public AffectationRhServiceImpl(AffectationRhRepository rhRepository, AffectationRhMapper rhMapper) {
        super(rhRepository, rhMapper);
    }
}
