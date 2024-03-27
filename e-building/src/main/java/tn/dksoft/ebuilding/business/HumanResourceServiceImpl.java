package tn.dksoft.ebuilding.business;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.HumanResourceDTO;
import tn.dksoft.ebuilding.entities.HumanResources;
import tn.dksoft.ebuilding.mappers.HumanResourceMapper;
import tn.dksoft.ebuilding.repositories.HumanResourceRepository;
import tn.dksoft.ebuilding.repositories.TresourceRepository;

@Service(value = "humanResourceService")
@Transactional
public class HumanResourceServiceImpl extends GenericServiceImpl<HumanResources, Long, HumanResourceDTO>implements HumanResourceService {
    @Autowired
    public HumanResourceServiceImpl(HumanResourceRepository humanResourceRepository, HumanResourceMapper humanResourceMapper) {
        super(humanResourceRepository, humanResourceMapper);
    }
}
