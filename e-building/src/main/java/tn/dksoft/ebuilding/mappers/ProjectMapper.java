package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.HumanResourceDTO;
import tn.dksoft.ebuilding.dtos.ProjectDto;
import tn.dksoft.ebuilding.entities.HumanResources;
import tn.dksoft.ebuilding.entities.Project;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,uses = {AddressMapper.class, CustomerMapper.class, HumanResourceMapper.class})
public interface ProjectMapper extends GenericMapper<ProjectDto, Project> {

    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Project toEntity(ProjectDto projectDto);


    @Override
    @Mapping(source="manager", target = "manager")
    @Mapping(source="customer", target = "customer")
    @Mapping(source="address", target = "address")
    ProjectDto toDto(Project project);
}
