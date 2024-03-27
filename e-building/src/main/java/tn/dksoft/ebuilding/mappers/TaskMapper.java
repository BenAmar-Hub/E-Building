package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.TaskDTO;
import tn.dksoft.ebuilding.entities.Task;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {TscheduleMapper.class})

public interface TaskMapper extends GenericMapper<TaskDTO, Task> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Task toEntity(TaskDTO taskDTO);
}
