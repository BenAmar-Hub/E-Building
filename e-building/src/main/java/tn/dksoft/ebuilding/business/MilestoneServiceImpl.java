package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.MilestoneDTO;
import tn.dksoft.ebuilding.entities.Milestone;
import tn.dksoft.ebuilding.mappers.MilestoneMapper;
import tn.dksoft.ebuilding.repositories.MilestoneRepository;
@Service(value = "MilestoneService")
@Transactional
public class MilestoneServiceImpl extends GenericServiceImpl<Milestone, Long, MilestoneDTO> implements MilestoneService {
    @Autowired
    public MilestoneServiceImpl(MilestoneRepository milestoneRepository, MilestoneMapper milestoneMapper) {
        super(milestoneRepository, milestoneMapper);
    }
}
