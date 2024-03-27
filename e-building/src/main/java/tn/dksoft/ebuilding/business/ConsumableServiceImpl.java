package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.ConsumableDTO;
import tn.dksoft.ebuilding.entities.Consumable;
import tn.dksoft.ebuilding.mappers.ConsumableMapper;
import tn.dksoft.ebuilding.repositories.ConsumableRepository;

@Service(value = "consumableService")
@Transactional
public class ConsumableServiceImpl extends GenericServiceImpl<Consumable, Long, ConsumableDTO> implements ConsumableService {
@Autowired
    public ConsumableServiceImpl(ConsumableRepository consumableRepository, ConsumableMapper consumableMapper){
    super(consumableRepository, consumableMapper);
}
}
