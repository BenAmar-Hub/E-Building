package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.TscheduleDTO;
import tn.dksoft.ebuilding.entities.Tschedule;
import tn.dksoft.ebuilding.mappers.TscheduleMapper;
import tn.dksoft.ebuilding.repositories.TscheduleRepository;

@Service(value = "tscheduleService")
@Transactional
public class TscheduleServiceImpl extends GenericServiceImpl<Tschedule, Long, TscheduleDTO> implements TscheduleService {
@Autowired
    public  TscheduleServiceImpl(TscheduleRepository tscheduleRepository, TscheduleMapper tscheduleMapper){
    super(tscheduleRepository,tscheduleMapper);
}
}
