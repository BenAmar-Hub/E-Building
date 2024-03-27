package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.MilestoneDTO;
import tn.dksoft.ebuilding.entities.Milestone;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {TaskMapper.class})

public interface MilestoneMapper extends GenericMapper<MilestoneDTO, Milestone> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Milestone toEntity(MilestoneDTO milestoneDTO);
}
