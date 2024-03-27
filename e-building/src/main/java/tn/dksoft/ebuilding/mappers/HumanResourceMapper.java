package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.EntrepriseDTO;
import tn.dksoft.ebuilding.dtos.HumanResourceDTO;
import tn.dksoft.ebuilding.entities.HumanResources;

import java.util.List;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {QualificationMapper.class})
public interface HumanResourceMapper extends GenericMapper<HumanResourceDTO, HumanResources> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    @Mapping(ignore = true, target = "labelResource")
    @Mapping(ignore = true, target = "unitCost")
    @Mapping(ignore = true, target = "quantity")
    @Mapping(ignore = true, target = "quantityMin")
    HumanResources toEntity(HumanResourceDTO humanResourceDTO);

    @Override
    @Mapping(ignore = true, target = "type")
     HumanResourceDTO toDto(HumanResources humanResources);
}
