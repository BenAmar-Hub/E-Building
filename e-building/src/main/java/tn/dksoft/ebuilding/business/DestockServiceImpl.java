package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.DestockDTO;
import tn.dksoft.ebuilding.entities.Destock;
import tn.dksoft.ebuilding.mappers.DestockMapper;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.repositories.DestockRepository;
import tn.dksoft.ebuilding.repositories.GenericRepository;
@Service(value = "destockService")
@Transactional
public class DestockServiceImpl extends GenericServiceImpl<Destock, Long, DestockDTO>implements DestockService {
    @Autowired
    public DestockServiceImpl(DestockRepository destockRepository, DestockMapper destockMapper) {
        super(destockRepository, destockMapper);
    }
}
