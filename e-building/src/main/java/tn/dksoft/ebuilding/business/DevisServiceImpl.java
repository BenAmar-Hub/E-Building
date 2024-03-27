package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.DevisDTO;
import tn.dksoft.ebuilding.entities.Devis;
import tn.dksoft.ebuilding.mappers.DevisMapper;
import tn.dksoft.ebuilding.repositories.DevisRepository;
@Service(value = "devisService")
@Transactional
public class DevisServiceImpl extends GenericServiceImpl<Devis, Long, DevisDTO>implements DevisService {
    @Autowired
    public DevisServiceImpl(DevisRepository devisRepository, DevisMapper devisMapper) {
        super(devisRepository, devisMapper);
    }
}
