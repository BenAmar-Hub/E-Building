package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.ConsumableDTO;
import tn.dksoft.ebuilding.entities.Consumable;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface ConsumableMapper extends GenericMapper<ConsumableDTO, Consumable> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Consumable toEntity(ConsumableDTO consumableDTO);

    @Override
    @Mapping(ignore = true, target = "type")
    ConsumableDTO toDto(Consumable consumable);
}
